package com.boxhdo.domain.model;

import M5.g;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class Network implements Parcelable {
    public static final Parcelable.Creator<Network> CREATOR = new Creator();

    /* renamed from: q  reason: collision with root package name */
    public final long f8046q;

    /* renamed from: r  reason: collision with root package name */
    public final String f8047r;

    /* renamed from: s  reason: collision with root package name */
    public final String f8048s;

    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<Network> {
        @Override // android.os.Parcelable.Creator
        public final Network createFromParcel(Parcel parcel) {
            g.f(parcel, "parcel");
            return new Network(parcel.readLong(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Network[] newArray(int i7) {
            return new Network[i7];
        }
    }

    public Network(long j7, String str, String str2) {
        g.f(str, "name");
        g.f(str2, "logoPath");
        this.f8046q = j7;
        this.f8047r = str;
        this.f8048s = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Network) {
            Network network = (Network) obj;
            return this.f8046q == network.f8046q && g.a(this.f8047r, network.f8047r) && g.a(this.f8048s, network.f8048s);
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f8046q;
        return this.f8048s.hashCode() + AbstractC0515y1.i(((int) (j7 ^ (j7 >>> 32))) * 31, 31, this.f8047r);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Network(id=");
        sb.append(this.f8046q);
        sb.append(", name=");
        sb.append(this.f8047r);
        sb.append(", logoPath=");
        return AbstractC1111a.t(sb, this.f8048s, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        g.f(parcel, "out");
        parcel.writeLong(this.f8046q);
        parcel.writeString(this.f8047r);
        parcel.writeString(this.f8048s);
    }
}
