package com.boxhdo.domain.model;

import M5.g;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
/* loaded from: classes.dex */
public final class Episode implements Parcelable {
    public static final Parcelable.Creator<Episode> CREATOR = new Creator();

    /* renamed from: A  reason: collision with root package name */
    public final boolean f7965A;

    /* renamed from: q  reason: collision with root package name */
    public final long f7966q;

    /* renamed from: r  reason: collision with root package name */
    public final long f7967r;

    /* renamed from: s  reason: collision with root package name */
    public final String f7968s;

    /* renamed from: t  reason: collision with root package name */
    public final long f7969t;

    /* renamed from: u  reason: collision with root package name */
    public final String f7970u;

    /* renamed from: v  reason: collision with root package name */
    public final long f7971v;

    /* renamed from: w  reason: collision with root package name */
    public final String f7972w;

    /* renamed from: x  reason: collision with root package name */
    public final int f7973x;

    /* renamed from: y  reason: collision with root package name */
    public final long f7974y;

    /* renamed from: z  reason: collision with root package name */
    public final int f7975z;

    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<Episode> {
        @Override // android.os.Parcelable.Creator
        public final Episode createFromParcel(Parcel parcel) {
            boolean z7;
            g.f(parcel, "parcel");
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            String readString = parcel.readString();
            long readLong3 = parcel.readLong();
            String readString2 = parcel.readString();
            long readLong4 = parcel.readLong();
            String readString3 = parcel.readString();
            int readInt = parcel.readInt();
            long readLong5 = parcel.readLong();
            int readInt2 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            return new Episode(readLong, readLong2, readString, readLong3, readString2, readLong4, readString3, readInt, readLong5, readInt2, z7);
        }

        @Override // android.os.Parcelable.Creator
        public final Episode[] newArray(int i7) {
            return new Episode[i7];
        }
    }

    public Episode(long j7, long j8, String str, long j9, String str2, long j10, String str3, int i7, long j11, int i8, boolean z7) {
        g.f(str, "stillPath");
        g.f(str2, "name");
        g.f(str3, "airDate");
        this.f7966q = j7;
        this.f7967r = j8;
        this.f7968s = str;
        this.f7969t = j9;
        this.f7970u = str2;
        this.f7971v = j10;
        this.f7972w = str3;
        this.f7973x = i7;
        this.f7974y = j11;
        this.f7975z = i8;
        this.f7965A = z7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Episode) {
            Episode episode = (Episode) obj;
            return this.f7966q == episode.f7966q && this.f7967r == episode.f7967r && g.a(this.f7968s, episode.f7968s) && this.f7969t == episode.f7969t && g.a(this.f7970u, episode.f7970u) && this.f7971v == episode.f7971v && g.a(this.f7972w, episode.f7972w) && this.f7973x == episode.f7973x && this.f7974y == episode.f7974y && this.f7975z == episode.f7975z && this.f7965A == episode.f7965A;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        long j7 = this.f7966q;
        long j8 = this.f7967r;
        int i7 = AbstractC0515y1.i(((((int) (j7 ^ (j7 >>> 32))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31, 31, this.f7968s);
        long j9 = this.f7969t;
        int i8 = AbstractC0515y1.i((i7 + ((int) (j9 ^ (j9 >>> 32)))) * 31, 31, this.f7970u);
        long j10 = this.f7971v;
        long j11 = this.f7974y;
        int i9 = (((((AbstractC0515y1.i((i8 + ((int) (j10 ^ (j10 >>> 32)))) * 31, 31, this.f7972w) + this.f7973x) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f7975z) * 31;
        boolean z7 = this.f7965A;
        int i10 = z7;
        if (z7 != 0) {
            i10 = 1;
        }
        return i9 + i10;
    }

    public final String toString() {
        return "Episode(id=" + this.f7966q + ", movieId=" + this.f7967r + ", stillPath=" + this.f7968s + ", seasonId=" + this.f7969t + ", name=" + this.f7970u + ", episodeNumber=" + this.f7971v + ", airDate=" + this.f7972w + ", runtime=" + this.f7973x + ", time=" + this.f7974y + ", percent=" + this.f7975z + ", lastWatch=" + this.f7965A + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        g.f(parcel, "out");
        parcel.writeLong(this.f7966q);
        parcel.writeLong(this.f7967r);
        parcel.writeString(this.f7968s);
        parcel.writeLong(this.f7969t);
        parcel.writeString(this.f7970u);
        parcel.writeLong(this.f7971v);
        parcel.writeString(this.f7972w);
        parcel.writeInt(this.f7973x);
        parcel.writeLong(this.f7974y);
        parcel.writeInt(this.f7975z);
        parcel.writeInt(this.f7965A ? 1 : 0);
    }
}
