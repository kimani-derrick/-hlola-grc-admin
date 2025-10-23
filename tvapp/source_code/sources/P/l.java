package P;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
/* loaded from: classes.dex */
public final class l extends View.BaseSavedState {
    public static final Parcelable.Creator<l> CREATOR = new A2.a(28);

    /* renamed from: q  reason: collision with root package name */
    public int f2757q;

    public final String toString() {
        StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" scrollPosition=");
        return AbstractC0515y1.n(sb, this.f2757q, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeInt(this.f2757q);
    }
}
