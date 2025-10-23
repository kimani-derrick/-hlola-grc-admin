package com.boxhdo.domain.model;

import M5.g;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
/* loaded from: classes.dex */
public final class Country implements Parcelable {
    public static final Parcelable.Creator<Country> CREATOR = new Creator();

    /* renamed from: q  reason: collision with root package name */
    public final long f7960q;

    /* renamed from: r  reason: collision with root package name */
    public final String f7961r;

    /* renamed from: s  reason: collision with root package name */
    public final String f7962s;

    /* renamed from: t  reason: collision with root package name */
    public final String f7963t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f7964u;

    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<Country> {
        @Override // android.os.Parcelable.Creator
        public final Country createFromParcel(Parcel parcel) {
            boolean z7;
            g.f(parcel, "parcel");
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            return new Country(readLong, readString, readString2, readString3, z7);
        }

        @Override // android.os.Parcelable.Creator
        public final Country[] newArray(int i7) {
            return new Country[i7];
        }
    }

    public Country(long j7, String str, String str2, String str3, boolean z7) {
        g.f(str, "iso");
        g.f(str2, "name");
        g.f(str3, "slug");
        this.f7960q = j7;
        this.f7961r = str;
        this.f7962s = str2;
        this.f7963t = str3;
        this.f7964u = z7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Country) {
            Country country = (Country) obj;
            return this.f7960q == country.f7960q && g.a(this.f7961r, country.f7961r) && g.a(this.f7962s, country.f7962s) && g.a(this.f7963t, country.f7963t) && this.f7964u == country.f7964u;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        long j7 = this.f7960q;
        int i7 = AbstractC0515y1.i(AbstractC0515y1.i(AbstractC0515y1.i(((int) (j7 ^ (j7 >>> 32))) * 31, 31, this.f7961r), 31, this.f7962s), 31, this.f7963t);
        boolean z7 = this.f7964u;
        int i8 = z7;
        if (z7 != 0) {
            i8 = 1;
        }
        return i7 + i8;
    }

    public final String toString() {
        return "Country(id=" + this.f7960q + ", iso=" + this.f7961r + ", name=" + this.f7962s + ", slug=" + this.f7963t + ", publish=" + this.f7964u + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        g.f(parcel, "out");
        parcel.writeLong(this.f7960q);
        parcel.writeString(this.f7961r);
        parcel.writeString(this.f7962s);
        parcel.writeString(this.f7963t);
        parcel.writeInt(this.f7964u ? 1 : 0);
    }
}
