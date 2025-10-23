package com.boxhdo.domain.model;

import M5.g;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class ListSeason {

    /* renamed from: a  reason: collision with root package name */
    public final List f8013a;

    public ListSeason(ArrayList arrayList) {
        this.f8013a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ListSeason) && g.a(this.f8013a, ((ListSeason) obj).f8013a);
    }

    public final int hashCode() {
        return this.f8013a.hashCode();
    }

    public final String toString() {
        return "ListSeason(list=" + this.f8013a + ")";
    }
}
