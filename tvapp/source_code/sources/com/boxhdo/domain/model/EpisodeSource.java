package com.boxhdo.domain.model;

import A5.l;
import A5.m;
import M5.g;
import android.os.Parcel;
import android.os.Parcelable;
import com.boxhdo.domain.type.Quality;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class EpisodeSource implements Parcelable {
    public static final Parcelable.Creator<EpisodeSource> CREATOR = new Creator();

    /* renamed from: q  reason: collision with root package name */
    public final long f7976q;

    /* renamed from: r  reason: collision with root package name */
    public final String f7977r;

    /* renamed from: s  reason: collision with root package name */
    public final String f7978s;

    /* renamed from: t  reason: collision with root package name */
    public final String f7979t;

    /* renamed from: u  reason: collision with root package name */
    public final int f7980u;

    /* renamed from: v  reason: collision with root package name */
    public final List f7981v;

    /* renamed from: w  reason: collision with root package name */
    public final StreamSource f7982w;

    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<EpisodeSource> {
        @Override // android.os.Parcelable.Creator
        public final EpisodeSource createFromParcel(Parcel parcel) {
            g.f(parcel, "parcel");
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i7 = 0; i7 != readInt2; i7++) {
                arrayList.add(SubtitleSource.CREATOR.createFromParcel(parcel));
            }
            return new EpisodeSource(readLong, readString, readString2, readString3, readInt, arrayList, StreamSource.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final EpisodeSource[] newArray(int i7) {
            return new EpisodeSource[i7];
        }
    }

    public EpisodeSource(long j7, String str, String str2, String str3, int i7, List list, StreamSource streamSource) {
        g.f(str, "name");
        g.f(str2, "stillPath");
        g.f(str3, "previewUrl");
        g.f(streamSource, "stream");
        this.f7976q = j7;
        this.f7977r = str;
        this.f7978s = str2;
        this.f7979t = str3;
        this.f7980u = i7;
        this.f7981v = list;
        this.f7982w = streamSource;
    }

    public final List a(Quality quality) {
        List L6;
        g.f(quality, "maxQuality");
        int ordinal = quality.ordinal();
        StreamSource streamSource = this.f7982w;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        L6 = l.L(streamSource.f8069u, streamSource.f8065q, streamSource.f8066r, streamSource.f8068t, streamSource.f8067s);
                    } else {
                        return streamSource.f8067s;
                    }
                } else {
                    L6 = l.L(streamSource.f8068t, streamSource.f8067s);
                }
            } else {
                L6 = l.L(streamSource.f8066r, streamSource.f8068t, streamSource.f8067s);
            }
        } else {
            L6 = l.L(streamSource.f8065q, streamSource.f8066r, streamSource.f8068t, streamSource.f8067s);
        }
        return m.Q(L6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EpisodeSource) {
            EpisodeSource episodeSource = (EpisodeSource) obj;
            return this.f7976q == episodeSource.f7976q && g.a(this.f7977r, episodeSource.f7977r) && g.a(this.f7978s, episodeSource.f7978s) && g.a(this.f7979t, episodeSource.f7979t) && this.f7980u == episodeSource.f7980u && g.a(this.f7981v, episodeSource.f7981v) && g.a(this.f7982w, episodeSource.f7982w);
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f7976q;
        int hashCode = this.f7981v.hashCode();
        return this.f7982w.hashCode() + ((hashCode + ((AbstractC0515y1.i(AbstractC0515y1.i(AbstractC0515y1.i(((int) (j7 ^ (j7 >>> 32))) * 31, 31, this.f7977r), 31, this.f7978s), 31, this.f7979t) + this.f7980u) * 31)) * 31);
    }

    public final String toString() {
        return "EpisodeSource(id=" + this.f7976q + ", name=" + this.f7977r + ", stillPath=" + this.f7978s + ", previewUrl=" + this.f7979t + ", previewSize=" + this.f7980u + ", subs=" + this.f7981v + ", stream=" + this.f7982w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        g.f(parcel, "out");
        parcel.writeLong(this.f7976q);
        parcel.writeString(this.f7977r);
        parcel.writeString(this.f7978s);
        parcel.writeString(this.f7979t);
        parcel.writeInt(this.f7980u);
        List<SubtitleSource> list = this.f7981v;
        parcel.writeInt(list.size());
        for (SubtitleSource subtitleSource : list) {
            subtitleSource.writeToParcel(parcel, i7);
        }
        this.f7982w.writeToParcel(parcel, i7);
    }
}
