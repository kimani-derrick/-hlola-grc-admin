package com.boxhdo.domain.model;

import M5.g;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class ListEpisode {

    /* renamed from: a  reason: collision with root package name */
    public final List f8012a;

    public ListEpisode(ArrayList arrayList) {
        this.f8012a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ListEpisode) && g.a(this.f8012a, ((ListEpisode) obj).f8012a);
    }

    public final int hashCode() {
        return this.f8012a.hashCode();
    }

    public final String toString() {
        return "ListEpisode(list=" + this.f8012a + ")";
    }
}
