package y1;

import android.os.Bundle;
import android.os.Parcelable;
import com.boxhdo.domain.model.Network;
import com.boxhdo.domain.type.NetworkType;
import java.io.Serializable;
import n0.InterfaceC1016g;
/* loaded from: classes.dex */
public final class f implements InterfaceC1016g {

    /* renamed from: a  reason: collision with root package name */
    public final Network f16361a;

    /* renamed from: b  reason: collision with root package name */
    public final NetworkType f16362b;

    public f(Network network, NetworkType networkType) {
        this.f16361a = network;
        this.f16362b = networkType;
    }

    public static final f fromBundle(Bundle bundle) {
        M5.g.f(bundle, "bundle");
        bundle.setClassLoader(f.class.getClassLoader());
        if (bundle.containsKey("network")) {
            if (!Parcelable.class.isAssignableFrom(Network.class) && !Serializable.class.isAssignableFrom(Network.class)) {
                throw new UnsupportedOperationException(Network.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            Network network = (Network) bundle.get("network");
            if (network != null) {
                if (bundle.containsKey("networkType")) {
                    if (!Parcelable.class.isAssignableFrom(NetworkType.class) && !Serializable.class.isAssignableFrom(NetworkType.class)) {
                        throw new UnsupportedOperationException(NetworkType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                    }
                    NetworkType networkType = (NetworkType) bundle.get("networkType");
                    if (networkType != null) {
                        return new f(network, networkType);
                    }
                    throw new IllegalArgumentException("Argument \"networkType\" is marked as non-null but was passed a null value.");
                }
                throw new IllegalArgumentException("Required argument \"networkType\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Argument \"network\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"network\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (M5.g.a(this.f16361a, fVar.f16361a) && this.f16362b == fVar.f16362b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f16362b.hashCode() + (this.f16361a.hashCode() * 31);
    }

    public final String toString() {
        return "TvNetworkDetailFragmentArgs(network=" + this.f16361a + ", networkType=" + this.f16362b + ")";
    }
}
