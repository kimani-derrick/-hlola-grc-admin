package Z1;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import d2.AbstractC0552a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Context f4550a;

    /* renamed from: b  reason: collision with root package name */
    public final a2.d f4551b;

    /* renamed from: c  reason: collision with root package name */
    public final b f4552c;

    public d(Context context, a2.d dVar, b bVar) {
        this.f4550a = context;
        this.f4551b = dVar;
        this.f4552c = bVar;
    }

    public final void a(T1.i iVar, int i7, boolean z7) {
        Long l7;
        int i8;
        Context context = this.f4550a;
        ComponentName componentName = new ComponentName(context, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(iVar.f3240a.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        Q1.c cVar = iVar.f3242c;
        adler32.update(allocate.putInt(AbstractC0552a.a(cVar)).array());
        byte[] bArr = iVar.f3241b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z7) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i9 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i9 >= i7) {
                        h4.b.o("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", iVar);
                        return;
                    }
                }
            }
        }
        SQLiteDatabase a7 = ((a2.j) this.f4551b).a();
        String valueOf = String.valueOf(AbstractC0552a.a(cVar));
        String str = iVar.f3240a;
        Cursor rawQuery = a7.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, valueOf});
        try {
            if (rawQuery.moveToNext()) {
                l7 = Long.valueOf(rawQuery.getLong(0));
            } else {
                l7 = 0L;
            }
            rawQuery.close();
            long longValue = l7.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            b bVar = this.f4552c;
            Long l8 = l7;
            builder.setMinimumLatency(bVar.a(cVar, longValue, i7));
            Set set = ((c) bVar.f4546b.get(cVar)).f4549c;
            if (set.contains(e.f4553q)) {
                i8 = 2;
            } else {
                i8 = 1;
            }
            builder.setRequiredNetworkType(i8);
            if (set.contains(e.f4555s)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(e.f4554r)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i7);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", AbstractC0552a.a(cVar));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {iVar, Integer.valueOf(value), Long.valueOf(bVar.a(cVar, longValue, i7)), l8, Integer.valueOf(i7)};
            String w7 = h4.b.w("JobInfoScheduler");
            if (Log.isLoggable(w7, 3)) {
                Log.d(w7, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }
}
