package com.boxhdo.domain.model;

import M5.g;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class Filter implements Parcelable {
    public static final Parcelable.Creator<Filter> CREATOR = new Creator();

    /* renamed from: q  reason: collision with root package name */
    public final String f7983q;

    /* renamed from: r  reason: collision with root package name */
    public final String f7984r;

    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<Filter> {
        @Override // android.os.Parcelable.Creator
        public final Filter createFromParcel(Parcel parcel) {
            g.f(parcel, "parcel");
            return new Filter(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Filter[] newArray(int i7) {
            return new Filter[i7];
        }
    }

    public Filter() {
        this("", "");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Filter) {
            Filter filter = (Filter) obj;
            return g.a(this.f7983q, filter.f7983q) && g.a(this.f7984r, filter.f7984r);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7984r.hashCode() + (this.f7983q.hashCode() * 31);
    }

    public final String toString() {
        return "Filter(id=" + this.f7983q + ", title=" + this.f7984r + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        g.f(parcel, "out");
        parcel.writeString(this.f7983q);
        parcel.writeString(this.f7984r);
    }

    public Filter(String str, String str2) {
        g.f(str, "id");
        g.f(str2, "title");
        this.f7983q = str;
        this.f7984r = str2;
    }
}
