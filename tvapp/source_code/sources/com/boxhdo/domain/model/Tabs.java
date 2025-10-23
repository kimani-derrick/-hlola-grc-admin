package com.boxhdo.domain.model;

import M5.g;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.List;
/* loaded from: classes.dex */
public final class Tabs {

    /* renamed from: a  reason: collision with root package name */
    public final String f8082a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8083b;

    /* renamed from: c  reason: collision with root package name */
    public final List f8084c;

    public Tabs(String str, String str2, List list) {
        g.f(list, "data");
        this.f8082a = str;
        this.f8083b = str2;
        this.f8084c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Tabs) {
            Tabs tabs = (Tabs) obj;
            return g.a(this.f8082a, tabs.f8082a) && g.a(this.f8083b, tabs.f8083b) && g.a(this.f8084c, tabs.f8084c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8084c.hashCode() + AbstractC0515y1.i(this.f8082a.hashCode() * 31, 31, this.f8083b);
    }

    public final String toString() {
        return "Tabs(id=" + this.f8082a + ", title=" + this.f8083b + ", data=" + this.f8084c + ")";
    }
}
