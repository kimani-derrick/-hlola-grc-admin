package com.boxhdo.domain.type;

import M5.g;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public enum MediaType implements Parcelable {
    f8095r("all"),
    f8096s("movie"),
    f8097t("tv");
    
    public static final Parcelable.Creator<MediaType> CREATOR = new Parcelable.Creator<MediaType>() { // from class: com.boxhdo.domain.type.MediaType.Creator
        @Override // android.os.Parcelable.Creator
        public final MediaType createFromParcel(Parcel parcel) {
            g.f(parcel, "parcel");
            return MediaType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MediaType[] newArray(int i7) {
            return new MediaType[i7];
        }
    };

    /* renamed from: q  reason: collision with root package name */
    public final String f8099q;

    MediaType(String str) {
        this.f8099q = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        g.f(parcel, "out");
        parcel.writeString(name());
    }
}
