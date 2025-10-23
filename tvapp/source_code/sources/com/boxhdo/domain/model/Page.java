package com.boxhdo.domain.model;

import M5.g;
import java.util.List;
/* loaded from: classes.dex */
public final class Page<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f8049a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8050b;

    /* renamed from: c  reason: collision with root package name */
    public final List f8051c;

    public Page(int i7, int i8, List list) {
        this.f8049a = i7;
        this.f8050b = i8;
        this.f8051c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Page) {
            Page page = (Page) obj;
            return this.f8049a == page.f8049a && this.f8050b == page.f8050b && g.a(this.f8051c, page.f8051c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8051c.hashCode() + (((this.f8049a * 31) + this.f8050b) * 31);
    }

    public final String toString() {
        return "Page(page=" + this.f8049a + ", limit=" + this.f8050b + ", result=" + this.f8051c + ")";
    }
}
