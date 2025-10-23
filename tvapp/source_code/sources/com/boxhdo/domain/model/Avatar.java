package com.boxhdo.domain.model;

import M5.g;
import android.os.Parcel;
import android.os.Parcelable;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class Avatar implements Parcelable {
    public static final Parcelable.Creator<Avatar> CREATOR = new Creator();

    /* renamed from: q  reason: collision with root package name */
    public final long f7930q;

    /* renamed from: r  reason: collision with root package name */
    public final String f7931r;

    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<Avatar> {
        @Override // android.os.Parcelable.Creator
        public final Avatar createFromParcel(Parcel parcel) {
            g.f(parcel, "parcel");
            return new Avatar(parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Avatar[] newArray(int i7) {
            return new Avatar[i7];
        }
    }

    public Avatar(long j7, String str) {
        g.f(str, "path");
        this.f7930q = j7;
        this.f7931r = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Avatar) {
            Avatar avatar = (Avatar) obj;
            return this.f7930q == avatar.f7930q && g.a(this.f7931r, avatar.f7931r);
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f7930q;
        return this.f7931r.hashCode() + (((int) (j7 ^ (j7 >>> 32))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Avatar(id=");
        sb.append(this.f7930q);
        sb.append(", path=");
        return AbstractC1111a.t(sb, this.f7931r, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        g.f(parcel, "out");
        parcel.writeLong(this.f7930q);
        parcel.writeString(this.f7931r);
    }
}
