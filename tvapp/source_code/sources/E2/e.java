package E2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class e extends b {
    public static final Parcelable.Creator<e> CREATOR = new A2.a(21);

    /* renamed from: A  reason: collision with root package name */
    public final int f582A;

    /* renamed from: B  reason: collision with root package name */
    public final int f583B;

    /* renamed from: C  reason: collision with root package name */
    public final int f584C;

    /* renamed from: q  reason: collision with root package name */
    public final long f585q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f586r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f587s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f588t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f589u;

    /* renamed from: v  reason: collision with root package name */
    public final long f590v;

    /* renamed from: w  reason: collision with root package name */
    public final long f591w;

    /* renamed from: x  reason: collision with root package name */
    public final List f592x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f593y;

    /* renamed from: z  reason: collision with root package name */
    public final long f594z;

    public e(long j7, boolean z7, boolean z8, boolean z9, boolean z10, long j8, long j9, List list, boolean z11, long j10, int i7, int i8, int i9) {
        this.f585q = j7;
        this.f586r = z7;
        this.f587s = z8;
        this.f588t = z9;
        this.f589u = z10;
        this.f590v = j8;
        this.f591w = j9;
        this.f592x = Collections.unmodifiableList(list);
        this.f593y = z11;
        this.f594z = j10;
        this.f582A = i7;
        this.f583B = i8;
        this.f584C = i9;
    }

    @Override // E2.b
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb.append(this.f590v);
        sb.append(", programSplicePlaybackPositionUs= ");
        return AbstractC1111a.s(sb, this.f591w, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f585q);
        parcel.writeByte(this.f586r ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f587s ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f588t ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f589u ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f590v);
        parcel.writeLong(this.f591w);
        List list = this.f592x;
        int size = list.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            d dVar = (d) list.get(i8);
            parcel.writeInt(dVar.f579a);
            parcel.writeLong(dVar.f580b);
            parcel.writeLong(dVar.f581c);
        }
        parcel.writeByte(this.f593y ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f594z);
        parcel.writeInt(this.f582A);
        parcel.writeInt(this.f583B);
        parcel.writeInt(this.f584C);
    }

    public e(Parcel parcel) {
        this.f585q = parcel.readLong();
        this.f586r = parcel.readByte() == 1;
        this.f587s = parcel.readByte() == 1;
        this.f588t = parcel.readByte() == 1;
        this.f589u = parcel.readByte() == 1;
        this.f590v = parcel.readLong();
        this.f591w = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i7 = 0; i7 < readInt; i7++) {
            arrayList.add(new d(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f592x = Collections.unmodifiableList(arrayList);
        this.f593y = parcel.readByte() == 1;
        this.f594z = parcel.readLong();
        this.f582A = parcel.readInt();
        this.f583B = parcel.readInt();
        this.f584C = parcel.readInt();
    }
}
