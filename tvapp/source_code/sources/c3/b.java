package c3;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import d3.ServiceConnectionC0553a;
import g3.n;
import i3.C0771a;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import n3.AbstractBinderC1034c;
import n3.AbstractC1032a;
import n3.C1033b;
import n3.InterfaceC1035d;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public ServiceConnectionC0553a f7258a;

    /* renamed from: b  reason: collision with root package name */
    public InterfaceC1035d f7259b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7260c;
    public final Object d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public d f7261e;
    public final Context f;

    /* renamed from: g  reason: collision with root package name */
    public final long f7262g;

    public b(Context context) {
        n.g(context);
        Context applicationContext = context.getApplicationContext();
        this.f = applicationContext != null ? applicationContext : context;
        this.f7260c = false;
        this.f7262g = -1L;
    }

    public static a a(Context context) {
        b bVar = new b(context);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            bVar.c();
            a e3 = bVar.e();
            d(e3, SystemClock.elapsedRealtime() - elapsedRealtime, null);
            return e3;
        } finally {
        }
    }

    public static void d(a aVar, long j7, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            String str = "1";
            hashMap.put("app_context", "1");
            if (aVar != null) {
                if (true != aVar.f7256b) {
                    str = "0";
                }
                hashMap.put("limit_ad_tracking", str);
                String str2 = aVar.f7257c;
                if (str2 != null) {
                    hashMap.put("ad_id_size", Integer.toString(str2.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j7));
            new c(hashMap).start();
        }
    }

    public final void b() {
        n.f("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f != null && this.f7258a != null) {
                    if (this.f7260c) {
                        C0771a.a().b(this.f, this.f7258a);
                    }
                    this.f7260c = false;
                    this.f7259b = null;
                    this.f7258a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        InterfaceC1035d c1033b;
        n.f("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f7260c) {
                    b();
                }
                Context context = this.f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    d3.d.f9227b.getClass();
                    int a7 = d3.d.a(context, 12451000);
                    if (a7 != 0 && a7 != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    ServiceConnectionC0553a serviceConnectionC0553a = new ServiceConnectionC0553a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    if (C0771a.a().c(context, context.getClass().getName(), intent, serviceConnectionC0553a, 1, null)) {
                        this.f7258a = serviceConnectionC0553a;
                        try {
                            IBinder a8 = serviceConnectionC0553a.a(TimeUnit.MILLISECONDS);
                            int i7 = AbstractBinderC1034c.d;
                            IInterface queryLocalInterface = a8.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            if (queryLocalInterface instanceof InterfaceC1035d) {
                                c1033b = (InterfaceC1035d) queryLocalInterface;
                            } else {
                                c1033b = new C1033b(a8);
                            }
                            this.f7259b = c1033b;
                            this.f7260c = true;
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } else {
                        throw new IOException("Connection failure");
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new Exception();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final a e() {
        a aVar;
        n.f("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f7260c) {
                    synchronized (this.d) {
                        d dVar = this.f7261e;
                        if (dVar == null || !dVar.f7268t) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        c();
                        if (!this.f7260c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e3) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e3);
                    }
                }
                n.g(this.f7258a);
                n.g(this.f7259b);
                try {
                    C1033b c1033b = (C1033b) this.f7259b;
                    c1033b.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    boolean z7 = true;
                    Parcel y3 = c1033b.y(obtain, 1);
                    String readString = y3.readString();
                    y3.recycle();
                    C1033b c1033b2 = (C1033b) this.f7259b;
                    c1033b2.getClass();
                    Parcel obtain2 = Parcel.obtain();
                    obtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i7 = AbstractC1032a.f12663a;
                    obtain2.writeInt(1);
                    Parcel y4 = c1033b2.y(obtain2, 2);
                    if (y4.readInt() == 0) {
                        z7 = false;
                    }
                    y4.recycle();
                    aVar = new a(readString, z7);
                } catch (RemoteException e7) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e7);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f();
        return aVar;
    }

    public final void f() {
        synchronized (this.d) {
            d dVar = this.f7261e;
            if (dVar != null) {
                dVar.f7267s.countDown();
                try {
                    this.f7261e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j7 = this.f7262g;
            if (j7 > 0) {
                this.f7261e = new d(this, j7);
            }
        }
    }

    public final void finalize() {
        b();
        super.finalize();
    }
}
