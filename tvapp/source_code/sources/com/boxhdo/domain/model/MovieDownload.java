package com.boxhdo.domain.model;

import M5.g;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class MovieDownload implements Parcelable {
    public static final Parcelable.Creator<MovieDownload> CREATOR = new Creator();

    /* renamed from: q  reason: collision with root package name */
    public final String f8041q;

    /* renamed from: r  reason: collision with root package name */
    public final int f8042r;

    /* renamed from: s  reason: collision with root package name */
    public final List f8043s;

    /* renamed from: t  reason: collision with root package name */
    public final List f8044t;

    /* renamed from: u  reason: collision with root package name */
    public final long f8045u;

    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<MovieDownload> {
        @Override // android.os.Parcelable.Creator
        public final MovieDownload createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            g.f(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i7 = 0; i7 != readInt2; i7++) {
                arrayList2.add(StreamUrl.CREATOR.createFromParcel(parcel));
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                for (int i8 = 0; i8 != readInt3; i8++) {
                    arrayList.add(SubtitleSource.CREATOR.createFromParcel(parcel));
                }
            }
            return new MovieDownload(readString, readInt, arrayList2, arrayList, parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final MovieDownload[] newArray(int i7) {
            return new MovieDownload[i7];
        }
    }

    public MovieDownload(String str, int i7, ArrayList arrayList, ArrayList arrayList2, long j7) {
        g.f(str, "movieName");
        this.f8041q = str;
        this.f8042r = i7;
        this.f8043s = arrayList;
        this.f8044t = arrayList2;
        this.f8045u = j7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MovieDownload) {
            MovieDownload movieDownload = (MovieDownload) obj;
            return g.a(this.f8041q, movieDownload.f8041q) && this.f8042r == movieDownload.f8042r && g.a(this.f8043s, movieDownload.f8043s) && g.a(this.f8044t, movieDownload.f8044t) && this.f8045u == movieDownload.f8045u;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f8043s.hashCode() + (((this.f8041q.hashCode() * 31) + this.f8042r) * 31)) * 31;
        List list = this.f8044t;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        long j7 = this.f8045u;
        return ((hashCode2 + hashCode) * 31) + ((int) (j7 ^ (j7 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MovieDownload(movieName=");
        sb.append(this.f8041q);
        sb.append(", quality=");
        sb.append(this.f8042r);
        sb.append(", streamUrls=");
        sb.append(this.f8043s);
        sb.append(", subtitle=");
        sb.append(this.f8044t);
        sb.append(", fileSize=");
        return AbstractC1111a.s(sb, this.f8045u, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        g.f(parcel, "out");
        parcel.writeString(this.f8041q);
        parcel.writeInt(this.f8042r);
        List<StreamUrl> list = this.f8043s;
        parcel.writeInt(list.size());
        for (StreamUrl streamUrl : list) {
            streamUrl.writeToParcel(parcel, i7);
        }
        List<SubtitleSource> list2 = this.f8044t;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            for (SubtitleSource subtitleSource : list2) {
                subtitleSource.writeToParcel(parcel, i7);
            }
        }
        parcel.writeLong(this.f8045u);
    }
}
