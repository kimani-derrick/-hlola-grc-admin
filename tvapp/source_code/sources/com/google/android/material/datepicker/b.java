package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new android.support.v4.media.a(12);

    /* renamed from: q  reason: collision with root package name */
    public final m f8844q;

    /* renamed from: r  reason: collision with root package name */
    public final m f8845r;

    /* renamed from: s  reason: collision with root package name */
    public final d f8846s;

    /* renamed from: t  reason: collision with root package name */
    public final m f8847t;

    /* renamed from: u  reason: collision with root package name */
    public final int f8848u;

    /* renamed from: v  reason: collision with root package name */
    public final int f8849v;

    public b(m mVar, m mVar2, d dVar, m mVar3) {
        this.f8844q = mVar;
        this.f8845r = mVar2;
        this.f8847t = mVar3;
        this.f8846s = dVar;
        if (mVar3 != null && mVar.f8890q.compareTo(mVar3.f8890q) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (mVar3 != null && mVar3.compareTo(mVar2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.f8849v = mVar.i(mVar2) + 1;
        this.f8848u = (mVar2.f8892s - mVar.f8892s) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f8844q.equals(bVar.f8844q) && this.f8845r.equals(bVar.f8845r) && Objects.equals(this.f8847t, bVar.f8847t) && this.f8846s.equals(bVar.f8846s)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8844q, this.f8845r, this.f8847t, this.f8846s});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeParcelable(this.f8844q, 0);
        parcel.writeParcelable(this.f8845r, 0);
        parcel.writeParcelable(this.f8847t, 0);
        parcel.writeParcelable(this.f8846s, 0);
    }
}
