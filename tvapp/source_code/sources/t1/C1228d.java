package t1;

import M5.g;
import android.os.Bundle;
import android.os.Parcelable;
import com.boxhdo.android.tv.R;
import com.boxhdo.domain.model.Network;
import com.boxhdo.domain.type.NetworkType;
import java.io.Serializable;
import n0.w;
/* renamed from: t1.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1228d implements w {

    /* renamed from: a  reason: collision with root package name */
    public final Network f14525a;

    /* renamed from: b  reason: collision with root package name */
    public final NetworkType f14526b;

    public C1228d(Network network, NetworkType networkType) {
        g.f(network, "network");
        this.f14525a = network;
        this.f14526b = networkType;
    }

    @Override // n0.w
    public final int a() {
        return R.id.goToNetworkDetail;
    }

    @Override // n0.w
    public final Bundle b() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Network.class);
        Network network = this.f14525a;
        if (isAssignableFrom) {
            g.d(network, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("network", network);
        } else if (Serializable.class.isAssignableFrom(Network.class)) {
            g.d(network, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("network", (Serializable) network);
        } else {
            throw new UnsupportedOperationException(Network.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        boolean isAssignableFrom2 = Parcelable.class.isAssignableFrom(NetworkType.class);
        NetworkType networkType = this.f14526b;
        if (isAssignableFrom2) {
            g.d(networkType, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("networkType", (Parcelable) networkType);
        } else if (Serializable.class.isAssignableFrom(NetworkType.class)) {
            g.d(networkType, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("networkType", networkType);
        } else {
            throw new UnsupportedOperationException(NetworkType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1228d)) {
            return false;
        }
        C1228d c1228d = (C1228d) obj;
        if (g.a(this.f14525a, c1228d.f14525a) && this.f14526b == c1228d.f14526b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14526b.hashCode() + (this.f14525a.hashCode() * 31);
    }

    public final String toString() {
        return "GoToNetworkDetail(network=" + this.f14525a + ", networkType=" + this.f14526b + ")";
    }
}
