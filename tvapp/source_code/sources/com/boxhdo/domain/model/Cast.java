package com.boxhdo.domain.model;

import A5.k;
import M5.g;
import U5.f;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
/* loaded from: classes.dex */
public final class Cast implements Parcelable {
    public static final Parcelable.Creator<Cast> CREATOR = new Creator();

    /* renamed from: q  reason: collision with root package name */
    public final long f7932q;

    /* renamed from: r  reason: collision with root package name */
    public final String f7933r;

    /* renamed from: s  reason: collision with root package name */
    public final String f7934s;

    /* renamed from: t  reason: collision with root package name */
    public final String f7935t;

    /* renamed from: u  reason: collision with root package name */
    public final int f7936u;

    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<Cast> {
        @Override // android.os.Parcelable.Creator
        public final Cast createFromParcel(Parcel parcel) {
            g.f(parcel, "parcel");
            return new Cast(parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Cast[] newArray(int i7) {
            return new Cast[i7];
        }
    }

    public Cast(int i7, long j7, String str, String str2, String str3) {
        g.f(str, "name");
        g.f(str2, "imageUrl");
        g.f(str3, "nationality");
        this.f7932q = j7;
        this.f7933r = str;
        this.f7934s = str2;
        this.f7935t = str3;
        this.f7936u = i7;
        String str4 = (String) k.c0(f.u0(str3, new String[]{",", "-"}));
        if (str4 != null) {
            f.C0(str4).toString();
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Cast) {
            Cast cast = (Cast) obj;
            return this.f7932q == cast.f7932q && g.a(this.f7933r, cast.f7933r) && g.a(this.f7934s, cast.f7934s) && g.a(this.f7935t, cast.f7935t) && this.f7936u == cast.f7936u;
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f7932q;
        return AbstractC0515y1.i(AbstractC0515y1.i(AbstractC0515y1.i(((int) (j7 ^ (j7 >>> 32))) * 31, 31, this.f7933r), 31, this.f7934s), 31, this.f7935t) + this.f7936u;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Cast(id=");
        sb.append(this.f7932q);
        sb.append(", name=");
        sb.append(this.f7933r);
        sb.append(", imageUrl=");
        sb.append(this.f7934s);
        sb.append(", nationality=");
        sb.append(this.f7935t);
        sb.append(", totalMovies=");
        return AbstractC0515y1.n(sb, this.f7936u, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        g.f(parcel, "out");
        parcel.writeLong(this.f7932q);
        parcel.writeString(this.f7933r);
        parcel.writeString(this.f7934s);
        parcel.writeString(this.f7935t);
        parcel.writeInt(this.f7936u);
    }
}
