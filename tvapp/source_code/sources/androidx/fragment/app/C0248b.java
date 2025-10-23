package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.EnumC0337o;
import java.util.ArrayList;
/* renamed from: androidx.fragment.app.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0248b implements Parcelable {
    public static final Parcelable.Creator<C0248b> CREATOR = new android.support.v4.media.a(6);

    /* renamed from: A  reason: collision with root package name */
    public final CharSequence f6004A;

    /* renamed from: B  reason: collision with root package name */
    public final ArrayList f6005B;

    /* renamed from: C  reason: collision with root package name */
    public final ArrayList f6006C;

    /* renamed from: D  reason: collision with root package name */
    public final boolean f6007D;

    /* renamed from: q  reason: collision with root package name */
    public final int[] f6008q;

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList f6009r;

    /* renamed from: s  reason: collision with root package name */
    public final int[] f6010s;

    /* renamed from: t  reason: collision with root package name */
    public final int[] f6011t;

    /* renamed from: u  reason: collision with root package name */
    public final int f6012u;

    /* renamed from: v  reason: collision with root package name */
    public final String f6013v;

    /* renamed from: w  reason: collision with root package name */
    public final int f6014w;

    /* renamed from: x  reason: collision with root package name */
    public final int f6015x;

    /* renamed from: y  reason: collision with root package name */
    public final CharSequence f6016y;

    /* renamed from: z  reason: collision with root package name */
    public final int f6017z;

    public C0248b(Parcel parcel) {
        this.f6008q = parcel.createIntArray();
        this.f6009r = parcel.createStringArrayList();
        this.f6010s = parcel.createIntArray();
        this.f6011t = parcel.createIntArray();
        this.f6012u = parcel.readInt();
        this.f6013v = parcel.readString();
        this.f6014w = parcel.readInt();
        this.f6015x = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f6016y = (CharSequence) creator.createFromParcel(parcel);
        this.f6017z = parcel.readInt();
        this.f6004A = (CharSequence) creator.createFromParcel(parcel);
        this.f6005B = parcel.createStringArrayList();
        this.f6006C = parcel.createStringArrayList();
        this.f6007D = parcel.readInt() != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.fragment.app.a0, java.lang.Object] */
    public final void a(C0247a c0247a) {
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int[] iArr = this.f6008q;
            boolean z7 = true;
            if (i7 < iArr.length) {
                ?? obj = new Object();
                int i9 = i7 + 1;
                obj.f5997a = iArr[i7];
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Instantiate " + c0247a + " op #" + i8 + " base fragment #" + iArr[i9]);
                }
                obj.f6002h = EnumC0337o.values()[this.f6010s[i8]];
                obj.f6003i = EnumC0337o.values()[this.f6011t[i8]];
                int i10 = i7 + 2;
                if (iArr[i9] == 0) {
                    z7 = false;
                }
                obj.f5999c = z7;
                int i11 = iArr[i10];
                obj.d = i11;
                int i12 = iArr[i7 + 3];
                obj.f6000e = i12;
                int i13 = i7 + 5;
                int i14 = iArr[i7 + 4];
                obj.f = i14;
                i7 += 6;
                int i15 = iArr[i13];
                obj.f6001g = i15;
                c0247a.f5981b = i11;
                c0247a.f5982c = i12;
                c0247a.d = i14;
                c0247a.f5983e = i15;
                c0247a.b(obj);
                i8++;
            } else {
                c0247a.f = this.f6012u;
                c0247a.f5986i = this.f6013v;
                c0247a.f5984g = true;
                c0247a.f5987j = this.f6015x;
                c0247a.f5988k = this.f6016y;
                c0247a.f5989l = this.f6017z;
                c0247a.f5990m = this.f6004A;
                c0247a.n = this.f6005B;
                c0247a.f5991o = this.f6006C;
                c0247a.f5992p = this.f6007D;
                return;
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeIntArray(this.f6008q);
        parcel.writeStringList(this.f6009r);
        parcel.writeIntArray(this.f6010s);
        parcel.writeIntArray(this.f6011t);
        parcel.writeInt(this.f6012u);
        parcel.writeString(this.f6013v);
        parcel.writeInt(this.f6014w);
        parcel.writeInt(this.f6015x);
        TextUtils.writeToParcel(this.f6016y, parcel, 0);
        parcel.writeInt(this.f6017z);
        TextUtils.writeToParcel(this.f6004A, parcel, 0);
        parcel.writeStringList(this.f6005B);
        parcel.writeStringList(this.f6006C);
        parcel.writeInt(this.f6007D ? 1 : 0);
    }

    public C0248b(C0247a c0247a) {
        int size = c0247a.f5980a.size();
        this.f6008q = new int[size * 6];
        if (!c0247a.f5984g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f6009r = new ArrayList(size);
        this.f6010s = new int[size];
        this.f6011t = new int[size];
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            a0 a0Var = (a0) c0247a.f5980a.get(i8);
            int i9 = i7 + 1;
            this.f6008q[i7] = a0Var.f5997a;
            ArrayList arrayList = this.f6009r;
            ComponentCallbacksC0269x componentCallbacksC0269x = a0Var.f5998b;
            arrayList.add(componentCallbacksC0269x != null ? componentCallbacksC0269x.f6138u : null);
            int[] iArr = this.f6008q;
            iArr[i9] = a0Var.f5999c ? 1 : 0;
            iArr[i7 + 2] = a0Var.d;
            iArr[i7 + 3] = a0Var.f6000e;
            int i10 = i7 + 5;
            iArr[i7 + 4] = a0Var.f;
            i7 += 6;
            iArr[i10] = a0Var.f6001g;
            this.f6010s[i8] = a0Var.f6002h.ordinal();
            this.f6011t[i8] = a0Var.f6003i.ordinal();
        }
        this.f6012u = c0247a.f;
        this.f6013v = c0247a.f5986i;
        this.f6014w = c0247a.f5995s;
        this.f6015x = c0247a.f5987j;
        this.f6016y = c0247a.f5988k;
        this.f6017z = c0247a.f5989l;
        this.f6004A = c0247a.f5990m;
        this.f6005B = c0247a.n;
        this.f6006C = c0247a.f5991o;
        this.f6007D = c0247a.f5992p;
    }
}
