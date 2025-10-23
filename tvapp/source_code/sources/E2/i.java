package E2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class i extends b {
    public static final Parcelable.Creator<i> CREATOR = new A2.a(23);

    /* renamed from: q  reason: collision with root package name */
    public final List f606q;

    public i(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i7 = 0; i7 < readInt; i7++) {
            arrayList.add(new h(parcel));
        }
        this.f606q = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        List list = this.f606q;
        int size = list.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            h hVar = (h) list.get(i8);
            parcel.writeLong(hVar.f597a);
            parcel.writeByte(hVar.f598b ? (byte) 1 : (byte) 0);
            parcel.writeByte(hVar.f599c ? (byte) 1 : (byte) 0);
            parcel.writeByte(hVar.d ? (byte) 1 : (byte) 0);
            List list2 = hVar.f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i9 = 0; i9 < size2; i9++) {
                g gVar = (g) list2.get(i9);
                parcel.writeInt(gVar.f595a);
                parcel.writeLong(gVar.f596b);
            }
            parcel.writeLong(hVar.f600e);
            parcel.writeByte(hVar.f601g ? (byte) 1 : (byte) 0);
            parcel.writeLong(hVar.f602h);
            parcel.writeInt(hVar.f603i);
            parcel.writeInt(hVar.f604j);
            parcel.writeInt(hVar.f605k);
        }
    }

    public i(ArrayList arrayList) {
        this.f606q = Collections.unmodifiableList(arrayList);
    }
}
