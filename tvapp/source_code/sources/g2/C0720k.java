package g2;

import Z2.AbstractC0156a;
import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import e2.B0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;
/* renamed from: g2.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0720k {

    /* renamed from: a  reason: collision with root package name */
    public boolean f10693a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f10694b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f10695c;
    public final Object d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f10696e;
    public final Object f;

    /* renamed from: g  reason: collision with root package name */
    public Object f10697g;

    /* renamed from: h  reason: collision with root package name */
    public Object f10698h;

    public C0720k(Context context, H2.U u7) {
        Context applicationContext = context.getApplicationContext();
        this.f10694b = applicationContext;
        this.f10695c = u7;
        int i7 = Z2.H.f4603a;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.d = handler;
        int i8 = Z2.H.f4603a;
        this.f10696e = i8 >= 23 ? new C0718i(this) : null;
        this.f = i8 >= 21 ? new Z2.w(1, this) : null;
        Uri uriFor = C0716g.a() ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f10697g = uriFor != null ? new C0719j(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public static void a(C0720k c0720k, C0716g c0716g) {
        boolean z7;
        B0 b02;
        if (c0720k.f10693a && !c0716g.equals((C0716g) c0720k.f10698h)) {
            c0720k.f10698h = c0716g;
            K k5 = (K) ((H2.U) c0720k.f10695c).f981r;
            if (k5.f10571f0 == Looper.myLooper()) {
                z7 = true;
            } else {
                z7 = false;
            }
            AbstractC0156a.k(z7);
            if (!c0716g.equals(k5.e())) {
                k5.f10587w = c0716g;
                Z5.n nVar = k5.f10582r;
                if (nVar != null) {
                    N n = (N) nVar.f4918q;
                    synchronized (n.f9931q) {
                        b02 = n.f9930D;
                    }
                    if (b02 != null) {
                        ((W2.o) b02).j();
                    }
                }
            }
        }
    }

    public FileInputStream b(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e3) {
            String message = e3.getMessage();
            if (message != null && message.contains("compressed")) {
                ((u0.b) this.f10695c).f();
            }
            return null;
        }
    }

    public void c(int i7, Serializable serializable) {
        ((Executor) this.f10694b).execute(new Z2.l(this, i7, serializable, 3));
    }

    public C0720k(AssetManager assetManager, Executor executor, u0.b bVar, String str, File file) {
        this.f10693a = false;
        this.f10694b = executor;
        this.f10695c = bVar;
        this.f = str;
        this.f10696e = file;
        int i7 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i7 >= 24 && i7 <= 34) {
            switch (i7) {
                case 24:
                case 25:
                    bArr = u0.c.f14655h;
                    break;
                case 26:
                    bArr = u0.c.f14654g;
                    break;
                case 27:
                    bArr = u0.c.f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = u0.c.f14653e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = u0.c.d;
                    break;
            }
        }
        this.d = bArr;
    }
}
