package z1;

import com.boxhdo.domain.model.EpisodeSource;
/* renamed from: z1.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1509h extends AbstractC1510i {

    /* renamed from: a  reason: collision with root package name */
    public final EpisodeSource f16422a;

    /* renamed from: b  reason: collision with root package name */
    public final long f16423b;

    public C1509h(EpisodeSource episodeSource, long j7) {
        M5.g.f(episodeSource, "episodeSource");
        this.f16422a = episodeSource;
        this.f16423b = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1509h)) {
            return false;
        }
        C1509h c1509h = (C1509h) obj;
        if (M5.g.a(this.f16422a, c1509h.f16422a) && this.f16423b == c1509h.f16423b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f16423b;
        return (this.f16422a.hashCode() * 31) + ((int) (j7 ^ (j7 >>> 32)));
    }

    public final String toString() {
        return "Source(episodeSource=" + this.f16422a + ", time=" + this.f16423b + ")";
    }
}
