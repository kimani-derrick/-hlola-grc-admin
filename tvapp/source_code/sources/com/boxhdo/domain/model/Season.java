package com.boxhdo.domain.model;

import A5.t;
import M5.g;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class Season implements Parcelable {
    public static final Parcelable.Creator<Season> CREATOR = new Creator();

    /* renamed from: q  reason: collision with root package name */
    public final long f8055q;

    /* renamed from: r  reason: collision with root package name */
    public final String f8056r;

    /* renamed from: s  reason: collision with root package name */
    public final int f8057s;

    /* renamed from: t  reason: collision with root package name */
    public final String f8058t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f8059u;

    /* renamed from: v  reason: collision with root package name */
    public final List f8060v;

    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<Season> {
        @Override // android.os.Parcelable.Creator
        public final Season createFromParcel(Parcel parcel) {
            boolean z7;
            g.f(parcel, "parcel");
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i7 = 0; i7 != readInt2; i7++) {
                arrayList.add(Episode.CREATOR.createFromParcel(parcel));
            }
            return new Season(readLong, readString, readInt, readString2, z7, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Season[] newArray(int i7) {
            return new Season[i7];
        }
    }

    public Season() {
        this(0L, "", 0, "", false, t.f135q);
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        String str = this.f8056r;
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = str.charAt(i7);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        g.e(sb2, "filterTo(StringBuilder(), predicate).toString()");
        return sb2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Season) {
            Season season = (Season) obj;
            return this.f8055q == season.f8055q && g.a(this.f8056r, season.f8056r) && this.f8057s == season.f8057s && g.a(this.f8058t, season.f8058t) && this.f8059u == season.f8059u && g.a(this.f8060v, season.f8060v);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        long j7 = this.f8055q;
        int i7 = AbstractC0515y1.i((AbstractC0515y1.i(((int) (j7 ^ (j7 >>> 32))) * 31, 31, this.f8056r) + this.f8057s) * 31, 31, this.f8058t);
        boolean z7 = this.f8059u;
        int i8 = z7;
        if (z7 != 0) {
            i8 = 1;
        }
        return this.f8060v.hashCode() + ((i7 + i8) * 31);
    }

    public final String toString() {
        return "Season(id=" + this.f8055q + ", name=" + this.f8056r + ", numberEpisode=" + this.f8057s + ", releaseDate=" + this.f8058t + ", lastWatch=" + this.f8059u + ", episodes=" + this.f8060v + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        g.f(parcel, "out");
        parcel.writeLong(this.f8055q);
        parcel.writeString(this.f8056r);
        parcel.writeInt(this.f8057s);
        parcel.writeString(this.f8058t);
        parcel.writeInt(this.f8059u ? 1 : 0);
        List<Episode> list = this.f8060v;
        parcel.writeInt(list.size());
        for (Episode episode : list) {
            episode.writeToParcel(parcel, i7);
        }
    }

    public Season(long j7, String str, int i7, String str2, boolean z7, List list) {
        g.f(str, "name");
        g.f(str2, "releaseDate");
        g.f(list, "episodes");
        this.f8055q = j7;
        this.f8056r = str;
        this.f8057s = i7;
        this.f8058t = str2;
        this.f8059u = z7;
        this.f8060v = list;
    }
}
