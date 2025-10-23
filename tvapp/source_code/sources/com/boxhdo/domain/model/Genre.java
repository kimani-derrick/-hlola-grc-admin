package com.boxhdo.domain.model;

import M5.g;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
/* loaded from: classes.dex */
public final class Genre implements Parcelable {
    public static final Parcelable.Creator<Genre> CREATOR = new Creator();

    /* renamed from: q  reason: collision with root package name */
    public final long f7991q;

    /* renamed from: r  reason: collision with root package name */
    public final String f7992r;

    /* renamed from: s  reason: collision with root package name */
    public final String f7993s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f7994t;

    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<Genre> {
        @Override // android.os.Parcelable.Creator
        public final Genre createFromParcel(Parcel parcel) {
            boolean z7;
            g.f(parcel, "parcel");
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            return new Genre(readLong, readString, readString2, z7);
        }

        @Override // android.os.Parcelable.Creator
        public final Genre[] newArray(int i7) {
            return new Genre[i7];
        }
    }

    public Genre(long j7, String str, String str2, boolean z7) {
        g.f(str, "name");
        g.f(str2, "slug");
        this.f7991q = j7;
        this.f7992r = str;
        this.f7993s = str2;
        this.f7994t = z7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Genre) {
            Genre genre = (Genre) obj;
            return this.f7991q == genre.f7991q && g.a(this.f7992r, genre.f7992r) && g.a(this.f7993s, genre.f7993s) && this.f7994t == genre.f7994t;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        long j7 = this.f7991q;
        int i7 = AbstractC0515y1.i(AbstractC0515y1.i(((int) (j7 ^ (j7 >>> 32))) * 31, 31, this.f7992r), 31, this.f7993s);
        boolean z7 = this.f7994t;
        int i8 = z7;
        if (z7 != 0) {
            i8 = 1;
        }
        return i7 + i8;
    }

    public final String toString() {
        return "Genre(id=" + this.f7991q + ", name=" + this.f7992r + ", slug=" + this.f7993s + ", isPopular=" + this.f7994t + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        g.f(parcel, "out");
        parcel.writeLong(this.f7991q);
        parcel.writeString(this.f7992r);
        parcel.writeString(this.f7993s);
        parcel.writeInt(this.f7994t ? 1 : 0);
    }
}
