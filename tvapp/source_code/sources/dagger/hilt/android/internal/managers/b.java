package dagger.hilt.android.internal.managers;

import H2.C0002c;
import android.app.Activity;
import android.app.Application;
import androidx.activity.l;
import h1.C0745d;
import w5.InterfaceC1436a;
import w5.InterfaceC1437b;
/* loaded from: classes.dex */
public final class b implements InterfaceC1437b {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f9328q = 0;

    /* renamed from: r  reason: collision with root package name */
    public final Object f9329r = new Object();

    /* renamed from: s  reason: collision with root package name */
    public final Activity f9330s;

    /* renamed from: t  reason: collision with root package name */
    public final Object f9331t;

    /* renamed from: u  reason: collision with root package name */
    public volatile InterfaceC1436a f9332u;

    public b(Activity activity) {
        this.f9330s = activity;
        this.f9331t = new b((l) activity);
    }

    private final Object b() {
        if (((C0745d) this.f9332u) == null) {
            synchronized (this.f9329r) {
                try {
                    if (((C0745d) this.f9332u) == null) {
                        this.f9332u = a();
                    }
                } finally {
                }
            }
        }
        return (C0745d) this.f9332u;
    }

    public C0745d a() {
        String str;
        Activity activity = this.f9330s;
        if (!(activity.getApplication() instanceof InterfaceC1437b)) {
            StringBuilder sb = new StringBuilder("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
            if (Application.class.equals(activity.getApplication().getClass())) {
                str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
            } else {
                str = "Found: " + activity.getApplication().getClass();
            }
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }
        h1.f fVar = (h1.f) ((a) android.support.v4.media.session.b.g0(a.class, (b) this.f9331t));
        return new C0745d(fVar.f10873a, fVar.f10874b);
    }

    @Override // w5.InterfaceC1437b
    public final Object k() {
        switch (this.f9328q) {
            case 0:
                return b();
            default:
                if (((h1.f) this.f9332u) == null) {
                    synchronized (this.f9329r) {
                        try {
                            if (((h1.f) this.f9332u) == null) {
                                this.f9332u = ((e) new C0002c((l) this.f9330s, new c((l) this.f9331t)).x(e.class)).d;
                            }
                        } finally {
                        }
                    }
                }
                return (h1.f) this.f9332u;
        }
    }

    public b(l lVar) {
        this.f9330s = lVar;
        this.f9331t = lVar;
    }
}
