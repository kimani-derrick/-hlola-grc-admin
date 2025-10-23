package com.boxhdo.domain.model;

import M5.g;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
/* loaded from: classes.dex */
public final class SubtitleSource implements Parcelable {
    public static final Parcelable.Creator<SubtitleSource> CREATOR = new Creator();

    /* renamed from: q  reason: collision with root package name */
    public final long f8076q;

    /* renamed from: r  reason: collision with root package name */
    public final long f8077r;

    /* renamed from: s  reason: collision with root package name */
    public final String f8078s;

    /* renamed from: t  reason: collision with root package name */
    public final String f8079t;

    /* renamed from: u  reason: collision with root package name */
    public final String f8080u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f8081v;

    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<SubtitleSource> {
        @Override // android.os.Parcelable.Creator
        public final SubtitleSource createFromParcel(Parcel parcel) {
            boolean z7;
            g.f(parcel, "parcel");
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            return new SubtitleSource(readLong, readLong2, readString, readString2, readString3, z7);
        }

        @Override // android.os.Parcelable.Creator
        public final SubtitleSource[] newArray(int i7) {
            return new SubtitleSource[i7];
        }
    }

    public SubtitleSource(long j7, long j8, String str, String str2, String str3, boolean z7) {
        g.f(str, "link");
        g.f(str2, "lang");
        g.f(str3, "langCode");
        this.f8076q = j7;
        this.f8077r = j8;
        this.f8078s = str;
        this.f8079t = str2;
        this.f8080u = str3;
        this.f8081v = z7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SubtitleSource) {
            SubtitleSource subtitleSource = (SubtitleSource) obj;
            return this.f8076q == subtitleSource.f8076q && this.f8077r == subtitleSource.f8077r && g.a(this.f8078s, subtitleSource.f8078s) && g.a(this.f8079t, subtitleSource.f8079t) && g.a(this.f8080u, subtitleSource.f8080u) && this.f8081v == subtitleSource.f8081v;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        long j7 = this.f8076q;
        long j8 = this.f8077r;
        int i7 = AbstractC0515y1.i(AbstractC0515y1.i(AbstractC0515y1.i(((((int) (j7 ^ (j7 >>> 32))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31, 31, this.f8078s), 31, this.f8079t), 31, this.f8080u);
        boolean z7 = this.f8081v;
        int i8 = z7;
        if (z7 != 0) {
            i8 = 1;
        }
        return i7 + i8;
    }

    public final String toString() {
        return "SubtitleSource(id=" + this.f8076q + ", episodeId=" + this.f8077r + ", link=" + this.f8078s + ", lang=" + this.f8079t + ", langCode=" + this.f8080u + ", isSync=" + this.f8081v + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        g.f(parcel, "out");
        parcel.writeLong(this.f8076q);
        parcel.writeLong(this.f8077r);
        parcel.writeString(this.f8078s);
        parcel.writeString(this.f8079t);
        parcel.writeString(this.f8080u);
        parcel.writeInt(this.f8081v ? 1 : 0);
    }
}
