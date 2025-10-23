package n0;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.EnumC0337o;
/* renamed from: n0.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1020k implements Parcelable {
    public static final Parcelable.Creator<C1020k> CREATOR = new android.support.v4.media.a(27);

    /* renamed from: q  reason: collision with root package name */
    public final String f12552q;

    /* renamed from: r  reason: collision with root package name */
    public final int f12553r;

    /* renamed from: s  reason: collision with root package name */
    public final Bundle f12554s;

    /* renamed from: t  reason: collision with root package name */
    public final Bundle f12555t;

    public C1020k(Parcel parcel) {
        M5.g.f(parcel, "inParcel");
        String readString = parcel.readString();
        M5.g.c(readString);
        this.f12552q = readString;
        this.f12553r = parcel.readInt();
        this.f12554s = parcel.readBundle(C1020k.class.getClassLoader());
        Bundle readBundle = parcel.readBundle(C1020k.class.getClassLoader());
        M5.g.c(readBundle);
        this.f12555t = readBundle;
    }

    public final C1019j a(Context context, v vVar, EnumC0337o enumC0337o, q qVar) {
        M5.g.f(context, "context");
        M5.g.f(enumC0337o, "hostLifecycleState");
        Bundle bundle = this.f12554s;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        String str = this.f12552q;
        M5.g.f(str, "id");
        return new C1019j(context, vVar, bundle2, enumC0337o, qVar, str, this.f12555t);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        M5.g.f(parcel, "parcel");
        parcel.writeString(this.f12552q);
        parcel.writeInt(this.f12553r);
        parcel.writeBundle(this.f12554s);
        parcel.writeBundle(this.f12555t);
    }

    public C1020k(C1019j c1019j) {
        M5.g.f(c1019j, "entry");
        this.f12552q = c1019j.f12547v;
        this.f12553r = c1019j.f12543r.f12607x;
        this.f12554s = c1019j.f12544s;
        Bundle bundle = new Bundle();
        this.f12555t = bundle;
        c1019j.f12550y.h(bundle);
    }
}
