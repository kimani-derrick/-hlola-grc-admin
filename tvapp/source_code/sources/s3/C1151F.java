package s3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
/* renamed from: s3.F  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1151F extends com.google.android.gms.internal.measurement.F implements InterfaceC1149D {
    public C1151F(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 0);
    }

    @Override // s3.InterfaceC1149D
    public final List b(Bundle bundle, m1 m1Var) {
        Parcel y3 = y();
        com.google.android.gms.internal.measurement.H.c(y3, m1Var);
        com.google.android.gms.internal.measurement.H.c(y3, bundle);
        Parcel B6 = B(y3, 24);
        ArrayList createTypedArrayList = B6.createTypedArrayList(j1.CREATOR);
        B6.recycle();
        return createTypedArrayList;
    }

    @Override // s3.InterfaceC1149D
    public final void e(m1 m1Var) {
        Parcel y3 = y();
        com.google.android.gms.internal.measurement.H.c(y3, m1Var);
        C(y3, 6);
    }

    @Override // s3.InterfaceC1149D
    public final byte[] f(C1201u c1201u, String str) {
        Parcel y3 = y();
        com.google.android.gms.internal.measurement.H.c(y3, c1201u);
        y3.writeString(str);
        Parcel B6 = B(y3, 9);
        byte[] createByteArray = B6.createByteArray();
        B6.recycle();
        return createByteArray;
    }

    @Override // s3.InterfaceC1149D
    public final void g(m1 m1Var) {
        Parcel y3 = y();
        com.google.android.gms.internal.measurement.H.c(y3, m1Var);
        C(y3, 20);
    }

    @Override // s3.InterfaceC1149D
    public final void h(m1 m1Var) {
        Parcel y3 = y();
        com.google.android.gms.internal.measurement.H.c(y3, m1Var);
        C(y3, 4);
    }

    @Override // s3.InterfaceC1149D
    public final C1176h i(m1 m1Var) {
        Parcel y3 = y();
        com.google.android.gms.internal.measurement.H.c(y3, m1Var);
        Parcel B6 = B(y3, 21);
        C1176h c1176h = (C1176h) com.google.android.gms.internal.measurement.H.a(B6, C1176h.CREATOR);
        B6.recycle();
        return c1176h;
    }

    @Override // s3.InterfaceC1149D
    public final void j(C1201u c1201u, m1 m1Var) {
        Parcel y3 = y();
        com.google.android.gms.internal.measurement.H.c(y3, c1201u);
        com.google.android.gms.internal.measurement.H.c(y3, m1Var);
        C(y3, 1);
    }

    @Override // s3.InterfaceC1149D
    public final void k(u1 u1Var, m1 m1Var) {
        Parcel y3 = y();
        com.google.android.gms.internal.measurement.H.c(y3, u1Var);
        com.google.android.gms.internal.measurement.H.c(y3, m1Var);
        C(y3, 2);
    }

    @Override // s3.InterfaceC1149D
    public final List m(String str, String str2, boolean z7, m1 m1Var) {
        Parcel y3 = y();
        y3.writeString(str);
        y3.writeString(str2);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.H.f8350a;
        y3.writeInt(z7 ? 1 : 0);
        com.google.android.gms.internal.measurement.H.c(y3, m1Var);
        Parcel B6 = B(y3, 14);
        ArrayList createTypedArrayList = B6.createTypedArrayList(u1.CREATOR);
        B6.recycle();
        return createTypedArrayList;
    }

    @Override // s3.InterfaceC1149D
    public final void n(m1 m1Var) {
        Parcel y3 = y();
        com.google.android.gms.internal.measurement.H.c(y3, m1Var);
        C(y3, 25);
    }

    @Override // s3.InterfaceC1149D
    public final void o(m1 m1Var) {
        Parcel y3 = y();
        com.google.android.gms.internal.measurement.H.c(y3, m1Var);
        C(y3, 26);
    }

    @Override // s3.InterfaceC1149D
    public final void p(long j7, String str, String str2, String str3) {
        Parcel y3 = y();
        y3.writeLong(j7);
        y3.writeString(str);
        y3.writeString(str2);
        y3.writeString(str3);
        C(y3, 10);
    }

    @Override // s3.InterfaceC1149D
    public final List q(String str, String str2, String str3, boolean z7) {
        Parcel y3 = y();
        y3.writeString(str);
        y3.writeString(str2);
        y3.writeString(str3);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.H.f8350a;
        y3.writeInt(z7 ? 1 : 0);
        Parcel B6 = B(y3, 15);
        ArrayList createTypedArrayList = B6.createTypedArrayList(u1.CREATOR);
        B6.recycle();
        return createTypedArrayList;
    }

    @Override // s3.InterfaceC1149D
    public final List s(String str, String str2, String str3) {
        Parcel y3 = y();
        y3.writeString(str);
        y3.writeString(str2);
        y3.writeString(str3);
        Parcel B6 = B(y3, 17);
        ArrayList createTypedArrayList = B6.createTypedArrayList(C1168d.CREATOR);
        B6.recycle();
        return createTypedArrayList;
    }

    @Override // s3.InterfaceC1149D
    public final void t(m1 m1Var) {
        Parcel y3 = y();
        com.google.android.gms.internal.measurement.H.c(y3, m1Var);
        C(y3, 18);
    }

    @Override // s3.InterfaceC1149D
    public final void u(C1168d c1168d, m1 m1Var) {
        Parcel y3 = y();
        com.google.android.gms.internal.measurement.H.c(y3, c1168d);
        com.google.android.gms.internal.measurement.H.c(y3, m1Var);
        C(y3, 12);
    }

    @Override // s3.InterfaceC1149D
    public final String v(m1 m1Var) {
        Parcel y3 = y();
        com.google.android.gms.internal.measurement.H.c(y3, m1Var);
        Parcel B6 = B(y3, 11);
        String readString = B6.readString();
        B6.recycle();
        return readString;
    }

    @Override // s3.InterfaceC1149D
    public final List w(String str, String str2, m1 m1Var) {
        Parcel y3 = y();
        y3.writeString(str);
        y3.writeString(str2);
        com.google.android.gms.internal.measurement.H.c(y3, m1Var);
        Parcel B6 = B(y3, 16);
        ArrayList createTypedArrayList = B6.createTypedArrayList(C1168d.CREATOR);
        B6.recycle();
        return createTypedArrayList;
    }

    @Override // s3.InterfaceC1149D
    /* renamed from: b */
    public final void mo1b(Bundle bundle, m1 m1Var) {
        Parcel y3 = y();
        com.google.android.gms.internal.measurement.H.c(y3, bundle);
        com.google.android.gms.internal.measurement.H.c(y3, m1Var);
        C(y3, 19);
    }
}
