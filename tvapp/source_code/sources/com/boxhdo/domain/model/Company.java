package com.boxhdo.domain.model;

import M5.g;
import android.os.Parcel;
import android.os.Parcelable;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class Company implements Parcelable {
    public static final Parcelable.Creator<Company> CREATOR = new Creator();

    /* renamed from: q  reason: collision with root package name */
    public final long f7937q;

    /* renamed from: r  reason: collision with root package name */
    public final String f7938r;

    /* renamed from: s  reason: collision with root package name */
    public final String f7939s;

    /* renamed from: t  reason: collision with root package name */
    public final String f7940t;

    /* renamed from: u  reason: collision with root package name */
    public final String f7941u;

    /* renamed from: v  reason: collision with root package name */
    public final String f7942v;

    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<Company> {
        @Override // android.os.Parcelable.Creator
        public final Company createFromParcel(Parcel parcel) {
            g.f(parcel, "parcel");
            return new Company(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Company[] newArray(int i7) {
            return new Company[i7];
        }
    }

    public Company(long j7, String str, String str2, String str3, String str4, String str5) {
        this.f7937q = j7;
        this.f7938r = str;
        this.f7939s = str2;
        this.f7940t = str3;
        this.f7941u = str4;
        this.f7942v = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Company) {
            Company company = (Company) obj;
            return this.f7937q == company.f7937q && g.a(this.f7938r, company.f7938r) && g.a(this.f7939s, company.f7939s) && g.a(this.f7940t, company.f7940t) && g.a(this.f7941u, company.f7941u) && g.a(this.f7942v, company.f7942v);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        long j7 = this.f7937q;
        int i7 = ((int) (j7 ^ (j7 >>> 32))) * 31;
        int i8 = 0;
        String str = this.f7938r;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (i7 + hashCode) * 31;
        String str2 = this.f7939s;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str3 = this.f7940t;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str4 = this.f7941u;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str5 = this.f7942v;
        if (str5 != null) {
            i8 = str5.hashCode();
        }
        return i12 + i8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Company(id=");
        sb.append(this.f7937q);
        sb.append(", logoPath=");
        sb.append(this.f7938r);
        sb.append(", logoUrl=");
        sb.append(this.f7939s);
        sb.append(", name=");
        sb.append(this.f7940t);
        sb.append(", country=");
        sb.append(this.f7941u);
        sb.append(", slug=");
        return AbstractC1111a.t(sb, this.f7942v, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        g.f(parcel, "out");
        parcel.writeLong(this.f7937q);
        parcel.writeString(this.f7938r);
        parcel.writeString(this.f7939s);
        parcel.writeString(this.f7940t);
        parcel.writeString(this.f7941u);
        parcel.writeString(this.f7942v);
    }
}
