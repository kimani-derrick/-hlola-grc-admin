package F1;

import android.os.Bundle;
import android.os.Parcelable;
import com.boxhdo.domain.model.LatestVersion;
import java.io.Serializable;
import n0.InterfaceC1016g;
/* loaded from: classes.dex */
public final class n implements InterfaceC1016g {

    /* renamed from: a  reason: collision with root package name */
    public final LatestVersion f648a;

    public n(LatestVersion latestVersion) {
        this.f648a = latestVersion;
    }

    public static final n fromBundle(Bundle bundle) {
        M5.g.f(bundle, "bundle");
        bundle.setClassLoader(n.class.getClassLoader());
        if (bundle.containsKey("version")) {
            if (!Parcelable.class.isAssignableFrom(LatestVersion.class) && !Serializable.class.isAssignableFrom(LatestVersion.class)) {
                throw new UnsupportedOperationException(LatestVersion.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            LatestVersion latestVersion = (LatestVersion) bundle.get("version");
            if (latestVersion != null) {
                return new n(latestVersion);
            }
            throw new IllegalArgumentException("Argument \"version\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"version\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n) && M5.g.a(this.f648a, ((n) obj).f648a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f648a.hashCode();
    }

    public final String toString() {
        return "TVUpdateFragmentArgs(version=" + this.f648a + ")";
    }
}
