package com.google.android.gms.internal.measurement;

import a.AbstractC0189a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import h3.AbstractC0748a;
/* renamed from: com.google.android.gms.internal.measurement.c0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0405c0 extends AbstractC0748a {
    public static final Parcelable.Creator<C0405c0> CREATOR = new Object();

    /* renamed from: q  reason: collision with root package name */
    public final long f8518q;

    /* renamed from: r  reason: collision with root package name */
    public final long f8519r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f8520s;

    /* renamed from: t  reason: collision with root package name */
    public final String f8521t;

    /* renamed from: u  reason: collision with root package name */
    public final String f8522u;

    /* renamed from: v  reason: collision with root package name */
    public final String f8523v;

    /* renamed from: w  reason: collision with root package name */
    public final Bundle f8524w;

    /* renamed from: x  reason: collision with root package name */
    public final String f8525x;

    public C0405c0(long j7, long j8, boolean z7, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f8518q = j7;
        this.f8519r = j8;
        this.f8520s = z7;
        this.f8521t = str;
        this.f8522u = str2;
        this.f8523v = str3;
        this.f8524w = bundle;
        this.f8525x = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int P6 = AbstractC0189a.P(parcel, 20293);
        AbstractC0189a.R(parcel, 1, 8);
        parcel.writeLong(this.f8518q);
        AbstractC0189a.R(parcel, 2, 8);
        parcel.writeLong(this.f8519r);
        AbstractC0189a.R(parcel, 3, 4);
        parcel.writeInt(this.f8520s ? 1 : 0);
        AbstractC0189a.M(parcel, 4, this.f8521t);
        AbstractC0189a.M(parcel, 5, this.f8522u);
        AbstractC0189a.M(parcel, 6, this.f8523v);
        AbstractC0189a.J(parcel, 7, this.f8524w);
        AbstractC0189a.M(parcel, 8, this.f8525x);
        AbstractC0189a.Q(parcel, P6);
    }
}
