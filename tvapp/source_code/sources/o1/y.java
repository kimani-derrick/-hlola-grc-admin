package o1;

import com.boxhdo.domain.model.EpisodeSource;
/* loaded from: classes.dex */
public final class y extends A {

    /* renamed from: a  reason: collision with root package name */
    public final EpisodeSource f12885a;

    /* renamed from: b  reason: collision with root package name */
    public final long f12886b;

    public y(EpisodeSource episodeSource, long j7) {
        this.f12885a = episodeSource;
        this.f12886b = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (M5.g.a(this.f12885a, yVar.f12885a) && this.f12886b == yVar.f12886b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f12886b;
        return (this.f12885a.hashCode() * 31) + ((int) (j7 ^ (j7 >>> 32)));
    }

    public final String toString() {
        return "ChangeUrl(source=" + this.f12885a + ", positionMs=" + this.f12886b + ")";
    }
}
