package g3;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.measurement.F;
import h3.AbstractC0748a;
import o3.AbstractC1068b;
/* renamed from: g3.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0735d extends AbstractC0748a {
    public static final Parcelable.Creator<C0735d> CREATOR = new android.support.v4.media.a(22);

    /* renamed from: E  reason: collision with root package name */
    public static final Scope[] f10782E = new Scope[0];
    public static final d3.c[] F = new d3.c[0];

    /* renamed from: A  reason: collision with root package name */
    public final boolean f10783A;

    /* renamed from: B  reason: collision with root package name */
    public final int f10784B;

    /* renamed from: C  reason: collision with root package name */
    public final boolean f10785C;

    /* renamed from: D  reason: collision with root package name */
    public final String f10786D;

    /* renamed from: q  reason: collision with root package name */
    public final int f10787q;

    /* renamed from: r  reason: collision with root package name */
    public final int f10788r;

    /* renamed from: s  reason: collision with root package name */
    public final int f10789s;

    /* renamed from: t  reason: collision with root package name */
    public String f10790t;

    /* renamed from: u  reason: collision with root package name */
    public final IBinder f10791u;

    /* renamed from: v  reason: collision with root package name */
    public Scope[] f10792v;

    /* renamed from: w  reason: collision with root package name */
    public Bundle f10793w;

    /* renamed from: x  reason: collision with root package name */
    public final Account f10794x;

    /* renamed from: y  reason: collision with root package name */
    public d3.c[] f10795y;

    /* renamed from: z  reason: collision with root package name */
    public d3.c[] f10796z;

    public C0735d(int i7, int i8, int i9, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, d3.c[] cVarArr, d3.c[] cVarArr2, boolean z7, int i10, boolean z8, String str2) {
        Account account2;
        Scope[] scopeArr2 = scopeArr == null ? f10782E : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        d3.c[] cVarArr3 = F;
        d3.c[] cVarArr4 = cVarArr == null ? cVarArr3 : cVarArr;
        cVarArr3 = cVarArr2 != null ? cVarArr2 : cVarArr3;
        this.f10787q = i7;
        this.f10788r = i8;
        this.f10789s = i9;
        if ("com.google.android.gms".equals(str)) {
            this.f10790t = "com.google.android.gms";
        } else {
            this.f10790t = str;
        }
        if (i7 < 2) {
            account2 = null;
            if (iBinder != null) {
                int i11 = AbstractBinderC0732a.d;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface f = queryLocalInterface instanceof e ? (e) queryLocalInterface : new F(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
                if (f != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            x xVar = (x) f;
                            Parcel z9 = xVar.z(xVar.A(), 2);
                            Account account3 = (Account) AbstractC1068b.a(z9, Account.CREATOR);
                            z9.recycle();
                            Binder.restoreCallingIdentity(clearCallingIdentity);
                            account2 = account3;
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                            Binder.restoreCallingIdentity(clearCallingIdentity);
                        }
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        throw th;
                    }
                }
            }
        } else {
            this.f10791u = iBinder;
            account2 = account;
        }
        this.f10794x = account2;
        this.f10792v = scopeArr2;
        this.f10793w = bundle2;
        this.f10795y = cVarArr4;
        this.f10796z = cVarArr3;
        this.f10783A = z7;
        this.f10784B = i10;
        this.f10785C = z8;
        this.f10786D = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        android.support.v4.media.a.a(this, parcel, i7);
    }
}
