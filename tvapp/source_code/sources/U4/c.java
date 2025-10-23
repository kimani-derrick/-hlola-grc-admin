package U4;

import V4.q;
import android.content.SharedPreferences;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.Callable;
import k.V0;
import v4.C1329g;
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3443a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3444b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f3445c;

    public /* synthetic */ c(Object obj, int i7, Object obj2) {
        this.f3443a = i7;
        this.f3444b = obj;
        this.f3445c = obj2;
    }

    private final Object a() {
        V4.g gVar = (V4.g) this.f3445c;
        q qVar = ((V4.e) this.f3444b).f3671b;
        synchronized (qVar) {
            FileOutputStream openFileOutput = qVar.f3727a.openFileOutput(qVar.f3728b, 0);
            openFileOutput.write(gVar.f3678a.toString().getBytes("UTF-8"));
            openFileOutput.close();
        }
        return null;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f3443a) {
            case 0:
                k kVar = (k) this.f3445c;
                V4.n nVar = ((f) this.f3444b).f3455g;
                synchronized (nVar.f3709b) {
                    SharedPreferences.Editor edit = nVar.f3708a.edit();
                    kVar.getClass();
                    edit.putLong("fetch_timeout_in_seconds", 60L).putLong("minimum_fetch_interval_in_seconds", kVar.f3459a).commit();
                }
                return null;
            case 1:
                return a();
            default:
                V0 v02 = (V0) this.f3444b;
                ((C1329g) v02.f11960a).h((String) v02.f11962c, (List) this.f3445c);
                return null;
        }
    }
}
