package com.boxhdo.domain.model;

import A5.t;
import M5.g;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class Shortcut implements Parcelable {
    public static final Parcelable.Creator<Shortcut> CREATOR = new Creator();

    /* renamed from: q  reason: collision with root package name */
    public final String f8061q;

    /* renamed from: r  reason: collision with root package name */
    public final String f8062r;

    /* renamed from: s  reason: collision with root package name */
    public final int f8063s;

    /* renamed from: t  reason: collision with root package name */
    public final List f8064t;

    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<Shortcut> {
        @Override // android.os.Parcelable.Creator
        public final Shortcut createFromParcel(Parcel parcel) {
            g.f(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i7 = 0; i7 != readInt2; i7++) {
                arrayList.add(Filter.CREATOR.createFromParcel(parcel));
            }
            return new Shortcut(readString, readString2, readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Shortcut[] newArray(int i7) {
            return new Shortcut[i7];
        }
    }

    public Shortcut() {
        this(15, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Shortcut) {
            Shortcut shortcut = (Shortcut) obj;
            return g.a(this.f8061q, shortcut.f8061q) && g.a(this.f8062r, shortcut.f8062r) && this.f8063s == shortcut.f8063s && g.a(this.f8064t, shortcut.f8064t);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8064t.hashCode() + ((AbstractC0515y1.i(this.f8061q.hashCode() * 31, 31, this.f8062r) + this.f8063s) * 31);
    }

    public final String toString() {
        return "Shortcut(id=" + this.f8061q + ", title=" + this.f8062r + ", resId=" + this.f8063s + ", filters=" + this.f8064t + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        g.f(parcel, "out");
        parcel.writeString(this.f8061q);
        parcel.writeString(this.f8062r);
        parcel.writeInt(this.f8063s);
        List<Filter> list = this.f8064t;
        parcel.writeInt(list.size());
        for (Filter filter : list) {
            filter.writeToParcel(parcel, i7);
        }
    }

    public /* synthetic */ Shortcut(int i7, String str, String str2) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? "" : str2, 0, t.f135q);
    }

    public Shortcut(String str, String str2, int i7, List list) {
        g.f(str, "id");
        g.f(str2, "title");
        g.f(list, "filters");
        this.f8061q = str;
        this.f8062r = str2;
        this.f8063s = i7;
        this.f8064t = list;
    }
}
