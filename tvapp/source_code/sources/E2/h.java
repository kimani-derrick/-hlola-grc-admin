package E2;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final long f597a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f598b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f599c;
    public final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final long f600e;
    public final List f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f601g;

    /* renamed from: h  reason: collision with root package name */
    public final long f602h;

    /* renamed from: i  reason: collision with root package name */
    public final int f603i;

    /* renamed from: j  reason: collision with root package name */
    public final int f604j;

    /* renamed from: k  reason: collision with root package name */
    public final int f605k;

    public h(long j7, boolean z7, boolean z8, boolean z9, ArrayList arrayList, long j8, boolean z10, long j9, int i7, int i8, int i9) {
        this.f597a = j7;
        this.f598b = z7;
        this.f599c = z8;
        this.d = z9;
        this.f = Collections.unmodifiableList(arrayList);
        this.f600e = j8;
        this.f601g = z10;
        this.f602h = j9;
        this.f603i = i7;
        this.f604j = i8;
        this.f605k = i9;
    }

    public h(Parcel parcel) {
        this.f597a = parcel.readLong();
        this.f598b = parcel.readByte() == 1;
        this.f599c = parcel.readByte() == 1;
        this.d = parcel.readByte() == 1;
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i7 = 0; i7 < readInt; i7++) {
            arrayList.add(new g(parcel.readLong(), parcel.readInt()));
        }
        this.f = Collections.unmodifiableList(arrayList);
        this.f600e = parcel.readLong();
        this.f601g = parcel.readByte() == 1;
        this.f602h = parcel.readLong();
        this.f603i = parcel.readInt();
        this.f604j = parcel.readInt();
        this.f605k = parcel.readInt();
    }
}
