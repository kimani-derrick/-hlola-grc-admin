package com.boxhdo.domain.model;

import M5.g;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class StreamSource implements Parcelable {
    public static final Parcelable.Creator<StreamSource> CREATOR = new Creator();

    /* renamed from: q  reason: collision with root package name */
    public final List f8065q;

    /* renamed from: r  reason: collision with root package name */
    public final List f8066r;

    /* renamed from: s  reason: collision with root package name */
    public final List f8067s;

    /* renamed from: t  reason: collision with root package name */
    public final List f8068t;

    /* renamed from: u  reason: collision with root package name */
    public final List f8069u;

    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<StreamSource> {
        @Override // android.os.Parcelable.Creator
        public final StreamSource createFromParcel(Parcel parcel) {
            g.f(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i7 = 0; i7 != readInt; i7++) {
                arrayList.add(StreamUrl.CREATOR.createFromParcel(parcel));
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i8 = 0; i8 != readInt2; i8++) {
                arrayList2.add(StreamUrl.CREATOR.createFromParcel(parcel));
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt3);
            for (int i9 = 0; i9 != readInt3; i9++) {
                arrayList3.add(StreamUrl.CREATOR.createFromParcel(parcel));
            }
            int readInt4 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(readInt4);
            for (int i10 = 0; i10 != readInt4; i10++) {
                arrayList4.add(StreamUrl.CREATOR.createFromParcel(parcel));
            }
            int readInt5 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(readInt5);
            for (int i11 = 0; i11 != readInt5; i11++) {
                arrayList5.add(StreamUrl.CREATOR.createFromParcel(parcel));
            }
            return new StreamSource(arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
        }

        @Override // android.os.Parcelable.Creator
        public final StreamSource[] newArray(int i7) {
            return new StreamSource[i7];
        }
    }

    public StreamSource(List list, List list2, List list3, List list4, List list5) {
        this.f8065q = list;
        this.f8066r = list2;
        this.f8067s = list3;
        this.f8068t = list4;
        this.f8069u = list5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StreamSource) {
            StreamSource streamSource = (StreamSource) obj;
            return g.a(this.f8065q, streamSource.f8065q) && g.a(this.f8066r, streamSource.f8066r) && g.a(this.f8067s, streamSource.f8067s) && g.a(this.f8068t, streamSource.f8068t) && g.a(this.f8069u, streamSource.f8069u);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f8066r.hashCode();
        int hashCode2 = this.f8067s.hashCode();
        int hashCode3 = this.f8068t.hashCode();
        return this.f8069u.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + (this.f8065q.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "StreamSource(fullHD=" + this.f8065q + ", hd=" + this.f8066r + ", sd=" + this.f8067s + ", sdp=" + this.f8068t + ", auto=" + this.f8069u + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        g.f(parcel, "out");
        List<StreamUrl> list = this.f8065q;
        parcel.writeInt(list.size());
        for (StreamUrl streamUrl : list) {
            streamUrl.writeToParcel(parcel, i7);
        }
        List<StreamUrl> list2 = this.f8066r;
        parcel.writeInt(list2.size());
        for (StreamUrl streamUrl2 : list2) {
            streamUrl2.writeToParcel(parcel, i7);
        }
        List<StreamUrl> list3 = this.f8067s;
        parcel.writeInt(list3.size());
        for (StreamUrl streamUrl3 : list3) {
            streamUrl3.writeToParcel(parcel, i7);
        }
        List<StreamUrl> list4 = this.f8068t;
        parcel.writeInt(list4.size());
        for (StreamUrl streamUrl4 : list4) {
            streamUrl4.writeToParcel(parcel, i7);
        }
        List<StreamUrl> list5 = this.f8069u;
        parcel.writeInt(list5.size());
        for (StreamUrl streamUrl5 : list5) {
            streamUrl5.writeToParcel(parcel, i7);
        }
    }
}
