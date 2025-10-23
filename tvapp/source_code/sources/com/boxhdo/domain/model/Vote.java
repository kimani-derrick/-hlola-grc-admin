package com.boxhdo.domain.model;

import M5.g;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class Vote implements Parcelable {
    public static final Parcelable.Creator<Vote> CREATOR = new Creator();

    /* renamed from: q  reason: collision with root package name */
    public final long f8085q;

    /* renamed from: r  reason: collision with root package name */
    public final long f8086r;

    /* renamed from: s  reason: collision with root package name */
    public final long f8087s;

    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<Vote> {
        @Override // android.os.Parcelable.Creator
        public final Vote createFromParcel(Parcel parcel) {
            g.f(parcel, "parcel");
            return new Vote(parcel.readLong(), parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final Vote[] newArray(int i7) {
            return new Vote[i7];
        }
    }

    public Vote(long j7, long j8, long j9) {
        this.f8085q = j7;
        this.f8086r = j8;
        this.f8087s = j9;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Vote) {
            Vote vote = (Vote) obj;
            return this.f8085q == vote.f8085q && this.f8086r == vote.f8086r && this.f8087s == vote.f8087s;
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f8085q;
        long j8 = this.f8086r;
        long j9 = this.f8087s;
        return (((((int) (j7 ^ (j7 >>> 32))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31) + ((int) ((j9 >>> 32) ^ j9));
    }

    public final String toString() {
        return "Vote(movieId=" + this.f8085q + ", count=" + this.f8086r + ", totalScore=" + this.f8087s + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        g.f(parcel, "out");
        parcel.writeLong(this.f8085q);
        parcel.writeLong(this.f8086r);
        parcel.writeLong(this.f8087s);
    }
}
