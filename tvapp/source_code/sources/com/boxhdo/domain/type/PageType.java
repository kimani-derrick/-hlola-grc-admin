package com.boxhdo.domain.type;

import M5.g;
import android.os.Parcel;
import android.os.Parcelable;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class PageType implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    PageType EF7;

    /* renamed from: q  reason: collision with root package name */
    public static final /* synthetic */ PageType[] f8103q = {new Enum("LATEST", 0), new Enum("TRENDING", 1), new Enum("POPULAR", 2)};
    public static final Parcelable.Creator<PageType> CREATOR = new Parcelable.Creator<PageType>() { // from class: com.boxhdo.domain.type.PageType.Creator
        @Override // android.os.Parcelable.Creator
        public final PageType createFromParcel(Parcel parcel) {
            g.f(parcel, "parcel");
            return PageType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PageType[] newArray(int i7) {
            return new PageType[i7];
        }
    };

    public static PageType valueOf(String str) {
        return (PageType) Enum.valueOf(PageType.class, str);
    }

    public static PageType[] values() {
        return (PageType[]) f8103q.clone();
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
