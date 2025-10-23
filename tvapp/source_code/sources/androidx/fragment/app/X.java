package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.EnumC0337o;
/* loaded from: classes.dex */
public final class X implements Parcelable {
    public static final Parcelable.Creator<X> CREATOR = new android.support.v4.media.a(10);

    /* renamed from: A  reason: collision with root package name */
    public final int f5960A;

    /* renamed from: B  reason: collision with root package name */
    public final String f5961B;

    /* renamed from: C  reason: collision with root package name */
    public final int f5962C;

    /* renamed from: D  reason: collision with root package name */
    public final boolean f5963D;

    /* renamed from: q  reason: collision with root package name */
    public final String f5964q;

    /* renamed from: r  reason: collision with root package name */
    public final String f5965r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f5966s;

    /* renamed from: t  reason: collision with root package name */
    public final int f5967t;

    /* renamed from: u  reason: collision with root package name */
    public final int f5968u;

    /* renamed from: v  reason: collision with root package name */
    public final String f5969v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f5970w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f5971x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f5972y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f5973z;

    public X(Parcel parcel) {
        this.f5964q = parcel.readString();
        this.f5965r = parcel.readString();
        this.f5966s = parcel.readInt() != 0;
        this.f5967t = parcel.readInt();
        this.f5968u = parcel.readInt();
        this.f5969v = parcel.readString();
        this.f5970w = parcel.readInt() != 0;
        this.f5971x = parcel.readInt() != 0;
        this.f5972y = parcel.readInt() != 0;
        this.f5973z = parcel.readInt() != 0;
        this.f5960A = parcel.readInt();
        this.f5961B = parcel.readString();
        this.f5962C = parcel.readInt();
        this.f5963D = parcel.readInt() != 0;
    }

    public final ComponentCallbacksC0269x a(I i7) {
        ComponentCallbacksC0269x a7 = i7.a(this.f5964q);
        a7.f6138u = this.f5965r;
        a7.f6102E = this.f5966s;
        a7.f6103G = true;
        a7.f6110N = this.f5967t;
        a7.f6111O = this.f5968u;
        a7.f6112P = this.f5969v;
        a7.f6115S = this.f5970w;
        a7.f6099B = this.f5971x;
        a7.f6114R = this.f5972y;
        a7.f6113Q = this.f5973z;
        a7.f6125d0 = EnumC0337o.values()[this.f5960A];
        a7.f6141x = this.f5961B;
        a7.f6142y = this.f5962C;
        a7.f6120Y = this.f5963D;
        return a7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f5964q);
        sb.append(" (");
        sb.append(this.f5965r);
        sb.append(")}:");
        if (this.f5966s) {
            sb.append(" fromLayout");
        }
        int i7 = this.f5968u;
        if (i7 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i7));
        }
        String str = this.f5969v;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f5970w) {
            sb.append(" retainInstance");
        }
        if (this.f5971x) {
            sb.append(" removing");
        }
        if (this.f5972y) {
            sb.append(" detached");
        }
        if (this.f5973z) {
            sb.append(" hidden");
        }
        String str2 = this.f5961B;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f5962C);
        }
        if (this.f5963D) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f5964q);
        parcel.writeString(this.f5965r);
        parcel.writeInt(this.f5966s ? 1 : 0);
        parcel.writeInt(this.f5967t);
        parcel.writeInt(this.f5968u);
        parcel.writeString(this.f5969v);
        parcel.writeInt(this.f5970w ? 1 : 0);
        parcel.writeInt(this.f5971x ? 1 : 0);
        parcel.writeInt(this.f5972y ? 1 : 0);
        parcel.writeInt(this.f5973z ? 1 : 0);
        parcel.writeInt(this.f5960A);
        parcel.writeString(this.f5961B);
        parcel.writeInt(this.f5962C);
        parcel.writeInt(this.f5963D ? 1 : 0);
    }

    public X(ComponentCallbacksC0269x componentCallbacksC0269x) {
        this.f5964q = componentCallbacksC0269x.getClass().getName();
        this.f5965r = componentCallbacksC0269x.f6138u;
        this.f5966s = componentCallbacksC0269x.f6102E;
        this.f5967t = componentCallbacksC0269x.f6110N;
        this.f5968u = componentCallbacksC0269x.f6111O;
        this.f5969v = componentCallbacksC0269x.f6112P;
        this.f5970w = componentCallbacksC0269x.f6115S;
        this.f5971x = componentCallbacksC0269x.f6099B;
        this.f5972y = componentCallbacksC0269x.f6114R;
        this.f5973z = componentCallbacksC0269x.f6113Q;
        this.f5960A = componentCallbacksC0269x.f6125d0.ordinal();
        this.f5961B = componentCallbacksC0269x.f6141x;
        this.f5962C = componentCallbacksC0269x.f6142y;
        this.f5963D = componentCallbacksC0269x.f6120Y;
    }
}
