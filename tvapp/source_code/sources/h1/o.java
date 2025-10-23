package h1;

import android.os.Bundle;
import android.os.Parcelable;
import com.boxhdo.android.tv.R;
import com.boxhdo.domain.model.LatestVersion;
import java.io.Serializable;
import n0.w;
/* loaded from: classes.dex */
public final class o implements w {

    /* renamed from: a  reason: collision with root package name */
    public final LatestVersion f10972a;

    public o(LatestVersion latestVersion) {
        this.f10972a = latestVersion;
    }

    @Override // n0.w
    public final int a() {
        return R.id.goToUpdate;
    }

    @Override // n0.w
    public final Bundle b() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(LatestVersion.class);
        LatestVersion latestVersion = this.f10972a;
        if (isAssignableFrom) {
            M5.g.d(latestVersion, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("version", latestVersion);
        } else if (Serializable.class.isAssignableFrom(LatestVersion.class)) {
            M5.g.d(latestVersion, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("version", (Serializable) latestVersion);
        } else {
            throw new UnsupportedOperationException(LatestVersion.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof o) && M5.g.a(this.f10972a, ((o) obj).f10972a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10972a.hashCode();
    }

    public final String toString() {
        return "GoToUpdate(version=" + this.f10972a + ")";
    }
}
