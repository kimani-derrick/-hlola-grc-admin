package s3;

import com.google.android.gms.internal.measurement.C0399b;
import com.google.android.gms.internal.measurement.C0506w2;
import java.util.HashMap;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final /* synthetic */ class Y implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13931a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Z f13932b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ String f13933c;

    public /* synthetic */ Y(int i7) {
        this.f13931a = i7;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f13931a) {
            case 0:
                C1178i F = this.f13932b.F();
                String str = this.f13933c;
                C1146A u02 = F.u0(str);
                HashMap hashMap = new HashMap();
                hashMap.put("platform", "android");
                hashMap.put("package_name", str);
                hashMap.put("gmp_version", 95001L);
                if (u02 != null) {
                    String h7 = u02.h();
                    if (h7 != null) {
                        hashMap.put("app_version", h7);
                    }
                    hashMap.put("app_version_int", Long.valueOf(u02.z()));
                    hashMap.put("dynamite_version", Long.valueOf(u02.O()));
                }
                return hashMap;
            case 1:
                Y y3 = new Y(0);
                y3.f13932b = this.f13932b;
                y3.f13933c = this.f13933c;
                return new C0506w2(y3);
            default:
                androidx.fragment.app.D d = new androidx.fragment.app.D(this.f13932b, 27, this.f13933c);
                C0399b c0399b = new C0399b("internal.remoteConfig", 1);
                c0399b.f8594r.put("getValue", new C0506w2(d));
                return c0399b;
        }
    }
}
