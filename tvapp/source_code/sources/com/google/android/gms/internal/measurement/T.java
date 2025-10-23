package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class T extends I implements W {
    public final AtomicReference d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f8423e;

    public T() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.d = new AtomicReference();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:
        r3 = r3.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object A(android.os.Bundle r3, java.lang.Class r4) {
        /*
            r0 = 0
            if (r3 == 0) goto L39
            java.lang.String r1 = "r"
            java.lang.Object r3 = r3.get(r1)
            if (r3 == 0) goto L39
            java.lang.Object r3 = r4.cast(r3)     // Catch: java.lang.ClassCastException -> L10
            return r3
        L10:
            r0 = move-exception
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getCanonicalName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected object type. Expected, Received: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = ", "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r4 = "AM"
            android.util.Log.w(r4, r3, r0)
            throw r0
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.T.A(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    @Override // com.google.android.gms.internal.measurement.W
    public final void d(Bundle bundle) {
        synchronized (this.d) {
            try {
                this.d.set(bundle);
                this.f8423e = true;
                this.d.notify();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.I
    public final boolean y(int i7, Parcel parcel, Parcel parcel2) {
        if (i7 == 1) {
            H.d(parcel);
            d((Bundle) H.a(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }

    public final Bundle z(long j7) {
        Bundle bundle;
        synchronized (this.d) {
            if (!this.f8423e) {
                try {
                    this.d.wait(j7);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.d.get();
        }
        return bundle;
    }
}
