package com.boxhdo.domain.model;

import M5.g;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
/* loaded from: classes.dex */
public final class LatestVersion implements Parcelable {
    public static final Parcelable.Creator<LatestVersion> CREATOR = new Creator();

    /* renamed from: q  reason: collision with root package name */
    public final String f8007q;

    /* renamed from: r  reason: collision with root package name */
    public final int f8008r;

    /* renamed from: s  reason: collision with root package name */
    public final String f8009s;

    /* renamed from: t  reason: collision with root package name */
    public final String f8010t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f8011u;

    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<LatestVersion> {
        @Override // android.os.Parcelable.Creator
        public final LatestVersion createFromParcel(Parcel parcel) {
            boolean z7;
            g.f(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            return new LatestVersion(readString, readInt, readString2, readString3, z7);
        }

        @Override // android.os.Parcelable.Creator
        public final LatestVersion[] newArray(int i7) {
            return new LatestVersion[i7];
        }
    }

    public LatestVersion() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LatestVersion) {
            LatestVersion latestVersion = (LatestVersion) obj;
            return g.a(this.f8007q, latestVersion.f8007q) && this.f8008r == latestVersion.f8008r && g.a(this.f8009s, latestVersion.f8009s) && g.a(this.f8010t, latestVersion.f8010t) && this.f8011u == latestVersion.f8011u;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i7 = AbstractC0515y1.i(AbstractC0515y1.i(((this.f8007q.hashCode() * 31) + this.f8008r) * 31, 31, this.f8009s), 31, this.f8010t);
        boolean z7 = this.f8011u;
        int i8 = z7;
        if (z7 != 0) {
            i8 = 1;
        }
        return i7 + i8;
    }

    public final String toString() {
        return "LatestVersion(version=" + this.f8007q + ", versionCode=" + this.f8008r + ", changeLog=" + this.f8009s + ", link=" + this.f8010t + ", forceUpdate=" + this.f8011u + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        g.f(parcel, "out");
        parcel.writeString(this.f8007q);
        parcel.writeInt(this.f8008r);
        parcel.writeString(this.f8009s);
        parcel.writeString(this.f8010t);
        parcel.writeInt(this.f8011u ? 1 : 0);
    }

    public /* synthetic */ LatestVersion(int i7) {
        this("", 0, "", "", false);
    }

    public LatestVersion(String str, int i7, String str2, String str3, boolean z7) {
        g.f(str, "version");
        g.f(str2, "changeLog");
        g.f(str3, "link");
        this.f8007q = str;
        this.f8008r = i7;
        this.f8009s = str2;
        this.f8010t = str3;
        this.f8011u = z7;
    }
}
