package u4;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;
import z4.C1518b;
/* loaded from: classes.dex */
public final class r implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15036a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s f15037b;

    public /* synthetic */ r(s sVar, int i7) {
        this.f15036a = i7;
        this.f15037b = sVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f15036a) {
            case 0:
                try {
                    t2.i iVar = this.f15037b.f15041e;
                    C1518b c1518b = (C1518b) iVar.f14557s;
                    c1518b.getClass();
                    boolean delete = new File((File) c1518b.f16462b, (String) iVar.f14556r).delete();
                    if (!delete) {
                        Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                    }
                    return Boolean.valueOf(delete);
                } catch (Exception e3) {
                    Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e3);
                    return Boolean.FALSE;
                }
            default:
                C1292p c1292p = this.f15037b.f15042g;
                t2.i iVar2 = c1292p.f15023c;
                C1518b c1518b2 = (C1518b) iVar2.f14557s;
                c1518b2.getClass();
                String str = (String) iVar2.f14556r;
                boolean z7 = true;
                if (!new File((File) c1518b2.f16462b, str).exists()) {
                    String e7 = c1292p.e();
                    if (e7 == null || !c1292p.f15028j.c(e7)) {
                        z7 = false;
                    }
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    C1518b c1518b3 = (C1518b) iVar2.f14557s;
                    c1518b3.getClass();
                    new File((File) c1518b3.f16462b, str).delete();
                }
                return Boolean.valueOf(z7);
        }
    }
}
