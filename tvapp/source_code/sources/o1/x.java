package o1;

import com.boxhdo.domain.model.EpisodeSource;
/* loaded from: classes.dex */
public final class x extends A {

    /* renamed from: a  reason: collision with root package name */
    public final EpisodeSource f12884a;

    public x(EpisodeSource episodeSource) {
        this.f12884a = episodeSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof x) && M5.g.a(this.f12884a, ((x) obj).f12884a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12884a.hashCode();
    }

    public final String toString() {
        return "ChangeConfig(episodeSource=" + this.f12884a + ")";
    }
}
