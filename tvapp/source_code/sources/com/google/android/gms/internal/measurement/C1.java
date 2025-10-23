package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public abstract class C1 {

    /* renamed from: a  reason: collision with root package name */
    public static D1 f8236a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int[] f8237b = {1, 2, 3, 4, 5, 6, 7};

    /* renamed from: c  reason: collision with root package name */
    public static final C0442j2 f8238c = new C0442j2(1);

    public static int A(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0412d2.n(i7) * size;
    }

    public static int B(List list) {
        return list.size() << 3;
    }

    public static void C(int i7, List list, C0516y2 c0516y2, boolean z7) {
        if (list != null && !list.isEmpty()) {
            c0516y2.getClass();
            boolean z8 = list instanceof C0462n2;
            int i8 = 0;
            C0412d2 c0412d2 = (C0412d2) c0516y2.f8717a;
            if (z8) {
                C0462n2 c0462n2 = (C0462n2) list;
                if (z7) {
                    c0412d2.M(i7, 2);
                    int i9 = 0;
                    for (int i10 = 0; i10 < c0462n2.f8618s; i10++) {
                        c0462n2.f(i10);
                        Logger logger = C0412d2.f;
                        i9 += 4;
                    }
                    c0412d2.N(i9);
                    while (i8 < c0462n2.f8618s) {
                        c0412d2.H(c0462n2.f(i8));
                        i8++;
                    }
                    return;
                }
                while (i8 < c0462n2.f8618s) {
                    c0412d2.G(i7, c0462n2.f(i8));
                    i8++;
                }
            } else if (z7) {
                c0412d2.M(i7, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Integer) list.get(i12)).getClass();
                    Logger logger2 = C0412d2.f;
                    i11 += 4;
                }
                c0412d2.N(i11);
                while (i8 < list.size()) {
                    c0412d2.H(((Integer) list.get(i8)).intValue());
                    i8++;
                }
            } else {
                while (i8 < list.size()) {
                    c0412d2.G(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
            }
        }
    }

    public static int D(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0412d2.B(i7) * size) + E(list);
    }

    public static int E(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0462n2) {
            C0462n2 c0462n2 = (C0462n2) list;
            i7 = 0;
            while (i8 < size) {
                i7 += C0412d2.z(c0462n2.f(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += C0412d2.z(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return i7;
    }

    public static void F(int i7, List list, C0516y2 c0516y2, boolean z7) {
        if (list != null && !list.isEmpty()) {
            c0516y2.getClass();
            boolean z8 = list instanceof C0521z2;
            int i8 = 0;
            C0412d2 c0412d2 = (C0412d2) c0516y2.f8717a;
            if (z8) {
                C0521z2 c0521z2 = (C0521z2) list;
                if (z7) {
                    c0412d2.M(i7, 2);
                    int i9 = 0;
                    for (int i10 = 0; i10 < c0521z2.f8722s; i10++) {
                        c0521z2.g(i10);
                        Logger logger = C0412d2.f;
                        i9 += 8;
                    }
                    c0412d2.N(i9);
                    while (i8 < c0521z2.f8722s) {
                        c0412d2.D(c0521z2.g(i8));
                        i8++;
                    }
                    return;
                }
                while (i8 < c0521z2.f8722s) {
                    c0412d2.E(c0521z2.g(i8), i7);
                    i8++;
                }
            } else if (z7) {
                c0412d2.M(i7, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Long) list.get(i12)).getClass();
                    Logger logger2 = C0412d2.f;
                    i11 += 8;
                }
                c0412d2.N(i11);
                while (i8 < list.size()) {
                    c0412d2.D(((Long) list.get(i8)).longValue());
                    i8++;
                }
            } else {
                while (i8 < list.size()) {
                    c0412d2.E(((Long) list.get(i8)).longValue(), i7);
                    i8++;
                }
            }
        }
    }

    public static int G(int i7, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C0412d2.B(i7) * list.size()) + H(list);
    }

    public static int H(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0521z2) {
            C0521z2 c0521z2 = (C0521z2) list;
            i7 = 0;
            while (i8 < size) {
                i7 += C0412d2.z(c0521z2.g(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += C0412d2.z(((Long) list.get(i8)).longValue());
                i8++;
            }
        }
        return i7;
    }

    public static void I(int i7, List list, C0516y2 c0516y2, boolean z7) {
        if (list != null && !list.isEmpty()) {
            c0516y2.getClass();
            boolean z8 = list instanceof AbstractC0437i2;
            C0412d2 c0412d2 = (C0412d2) c0516y2.f8717a;
            if (z8) {
                AbstractC0515y1.v(list);
                if (z7) {
                    c0412d2.M(i7, 2);
                    throw null;
                }
                throw null;
            }
            int i8 = 0;
            if (z7) {
                c0412d2.M(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    ((Float) list.get(i10)).getClass();
                    Logger logger = C0412d2.f;
                    i9 += 4;
                }
                c0412d2.N(i9);
                while (i8 < list.size()) {
                    c0412d2.H(Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                float floatValue = ((Float) list.get(i8)).floatValue();
                c0412d2.getClass();
                c0412d2.G(i7, Float.floatToRawIntBits(floatValue));
                i8++;
            }
        }
    }

    public static int J(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0412d2.B(i7) * size) + K(list);
    }

    public static int K(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0462n2) {
            C0462n2 c0462n2 = (C0462n2) list;
            i7 = 0;
            while (i8 < size) {
                int f = c0462n2.f(i8);
                i7 += C0412d2.F((f >> 31) ^ (f << 1));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                int intValue = ((Integer) list.get(i8)).intValue();
                i7 += C0412d2.F((intValue >> 31) ^ (intValue << 1));
                i8++;
            }
        }
        return i7;
    }

    public static void L(int i7, List list, C0516y2 c0516y2, boolean z7) {
        if (list != null && !list.isEmpty()) {
            c0516y2.getClass();
            boolean z8 = list instanceof C0462n2;
            int i8 = 0;
            C0412d2 c0412d2 = (C0412d2) c0516y2.f8717a;
            if (z8) {
                C0462n2 c0462n2 = (C0462n2) list;
                if (z7) {
                    c0412d2.M(i7, 2);
                    int i9 = 0;
                    for (int i10 = 0; i10 < c0462n2.f8618s; i10++) {
                        i9 += C0412d2.z(c0462n2.f(i10));
                    }
                    c0412d2.N(i9);
                    while (i8 < c0462n2.f8618s) {
                        c0412d2.L(c0462n2.f(i8));
                        i8++;
                    }
                    return;
                }
                while (i8 < c0462n2.f8618s) {
                    c0412d2.I(i7, c0462n2.f(i8));
                    i8++;
                }
            } else if (z7) {
                c0412d2.M(i7, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += C0412d2.z(((Integer) list.get(i12)).intValue());
                }
                c0412d2.N(i11);
                while (i8 < list.size()) {
                    c0412d2.L(((Integer) list.get(i8)).intValue());
                    i8++;
                }
            } else {
                while (i8 < list.size()) {
                    c0412d2.I(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
            }
        }
    }

    public static int M(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0412d2.B(i7) * size) + N(list);
    }

    public static int N(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0521z2) {
            C0521z2 c0521z2 = (C0521z2) list;
            i7 = 0;
            while (i8 < size) {
                long g7 = c0521z2.g(i8);
                i7 += C0412d2.z((g7 >> 63) ^ (g7 << 1));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                long longValue = ((Long) list.get(i8)).longValue();
                i7 += C0412d2.z((longValue >> 63) ^ (longValue << 1));
                i8++;
            }
        }
        return i7;
    }

    public static void O(int i7, List list, C0516y2 c0516y2, boolean z7) {
        if (list != null && !list.isEmpty()) {
            c0516y2.getClass();
            boolean z8 = list instanceof C0521z2;
            int i8 = 0;
            C0412d2 c0412d2 = (C0412d2) c0516y2.f8717a;
            if (z8) {
                C0521z2 c0521z2 = (C0521z2) list;
                if (z7) {
                    c0412d2.M(i7, 2);
                    int i9 = 0;
                    for (int i10 = 0; i10 < c0521z2.f8722s; i10++) {
                        i9 += C0412d2.z(c0521z2.g(i10));
                    }
                    c0412d2.N(i9);
                    while (i8 < c0521z2.f8722s) {
                        c0412d2.J(c0521z2.g(i8));
                        i8++;
                    }
                    return;
                }
                while (i8 < c0521z2.f8722s) {
                    c0412d2.K(c0521z2.g(i8), i7);
                    i8++;
                }
            } else if (z7) {
                c0412d2.M(i7, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += C0412d2.z(((Long) list.get(i12)).longValue());
                }
                c0412d2.N(i11);
                while (i8 < list.size()) {
                    c0412d2.J(((Long) list.get(i8)).longValue());
                    i8++;
                }
            } else {
                while (i8 < list.size()) {
                    c0412d2.K(((Long) list.get(i8)).longValue(), i7);
                    i8++;
                }
            }
        }
    }

    public static int P(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0412d2.B(i7) * size) + Q(list);
    }

    public static int Q(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0462n2) {
            C0462n2 c0462n2 = (C0462n2) list;
            i7 = 0;
            while (i8 < size) {
                i7 += C0412d2.F(c0462n2.f(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += C0412d2.F(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return i7;
    }

    public static void R(int i7, List list, C0516y2 c0516y2, boolean z7) {
        if (list != null && !list.isEmpty()) {
            c0516y2.getClass();
            boolean z8 = list instanceof C0462n2;
            int i8 = 0;
            C0412d2 c0412d2 = (C0412d2) c0516y2.f8717a;
            if (z8) {
                C0462n2 c0462n2 = (C0462n2) list;
                if (z7) {
                    c0412d2.M(i7, 2);
                    int i9 = 0;
                    for (int i10 = 0; i10 < c0462n2.f8618s; i10++) {
                        c0462n2.f(i10);
                        Logger logger = C0412d2.f;
                        i9 += 4;
                    }
                    c0412d2.N(i9);
                    while (i8 < c0462n2.f8618s) {
                        c0412d2.H(c0462n2.f(i8));
                        i8++;
                    }
                    return;
                }
                while (i8 < c0462n2.f8618s) {
                    c0412d2.G(i7, c0462n2.f(i8));
                    i8++;
                }
            } else if (z7) {
                c0412d2.M(i7, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Integer) list.get(i12)).getClass();
                    Logger logger2 = C0412d2.f;
                    i11 += 4;
                }
                c0412d2.N(i11);
                while (i8 < list.size()) {
                    c0412d2.H(((Integer) list.get(i8)).intValue());
                    i8++;
                }
            } else {
                while (i8 < list.size()) {
                    c0412d2.G(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
            }
        }
    }

    public static int S(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0412d2.B(i7) * size) + T(list);
    }

    public static int T(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0521z2) {
            C0521z2 c0521z2 = (C0521z2) list;
            i7 = 0;
            while (i8 < size) {
                i7 += C0412d2.z(c0521z2.g(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += C0412d2.z(((Long) list.get(i8)).longValue());
                i8++;
            }
        }
        return i7;
    }

    public static void U(int i7, List list, C0516y2 c0516y2, boolean z7) {
        if (list != null && !list.isEmpty()) {
            c0516y2.getClass();
            boolean z8 = list instanceof C0521z2;
            int i8 = 0;
            C0412d2 c0412d2 = (C0412d2) c0516y2.f8717a;
            if (z8) {
                C0521z2 c0521z2 = (C0521z2) list;
                if (z7) {
                    c0412d2.M(i7, 2);
                    int i9 = 0;
                    for (int i10 = 0; i10 < c0521z2.f8722s; i10++) {
                        c0521z2.g(i10);
                        Logger logger = C0412d2.f;
                        i9 += 8;
                    }
                    c0412d2.N(i9);
                    while (i8 < c0521z2.f8722s) {
                        c0412d2.D(c0521z2.g(i8));
                        i8++;
                    }
                    return;
                }
                while (i8 < c0521z2.f8722s) {
                    c0412d2.E(c0521z2.g(i8), i7);
                    i8++;
                }
            } else if (z7) {
                c0412d2.M(i7, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Long) list.get(i12)).getClass();
                    Logger logger2 = C0412d2.f;
                    i11 += 8;
                }
                c0412d2.N(i11);
                while (i8 < list.size()) {
                    c0412d2.D(((Long) list.get(i8)).longValue());
                    i8++;
                }
            } else {
                while (i8 < list.size()) {
                    c0412d2.E(((Long) list.get(i8)).longValue(), i7);
                    i8++;
                }
            }
        }
    }

    public static void V(int i7, List list, C0516y2 c0516y2, boolean z7) {
        if (list != null && !list.isEmpty()) {
            c0516y2.getClass();
            boolean z8 = list instanceof C0462n2;
            int i8 = 0;
            C0412d2 c0412d2 = (C0412d2) c0516y2.f8717a;
            if (z8) {
                C0462n2 c0462n2 = (C0462n2) list;
                if (z7) {
                    c0412d2.M(i7, 2);
                    int i9 = 0;
                    for (int i10 = 0; i10 < c0462n2.f8618s; i10++) {
                        int f = c0462n2.f(i10);
                        i9 += C0412d2.F((f >> 31) ^ (f << 1));
                    }
                    c0412d2.N(i9);
                    while (i8 < c0462n2.f8618s) {
                        int f7 = c0462n2.f(i8);
                        c0412d2.N((f7 >> 31) ^ (f7 << 1));
                        i8++;
                    }
                    return;
                }
                while (i8 < c0462n2.f8618s) {
                    int f8 = c0462n2.f(i8);
                    c0412d2.O(i7, (f8 >> 31) ^ (f8 << 1));
                    i8++;
                }
            } else if (z7) {
                c0412d2.M(i7, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    int intValue = ((Integer) list.get(i12)).intValue();
                    i11 += C0412d2.F((intValue >> 31) ^ (intValue << 1));
                }
                c0412d2.N(i11);
                while (i8 < list.size()) {
                    int intValue2 = ((Integer) list.get(i8)).intValue();
                    c0412d2.N((intValue2 >> 31) ^ (intValue2 << 1));
                    i8++;
                }
            } else {
                while (i8 < list.size()) {
                    int intValue3 = ((Integer) list.get(i8)).intValue();
                    c0412d2.O(i7, (intValue3 >> 31) ^ (intValue3 << 1));
                    i8++;
                }
            }
        }
    }

    public static void W(int i7, List list, C0516y2 c0516y2, boolean z7) {
        if (list != null && !list.isEmpty()) {
            c0516y2.getClass();
            boolean z8 = list instanceof C0521z2;
            int i8 = 0;
            C0412d2 c0412d2 = (C0412d2) c0516y2.f8717a;
            if (z8) {
                C0521z2 c0521z2 = (C0521z2) list;
                if (z7) {
                    c0412d2.M(i7, 2);
                    int i9 = 0;
                    for (int i10 = 0; i10 < c0521z2.f8722s; i10++) {
                        long g7 = c0521z2.g(i10);
                        i9 += C0412d2.z((g7 >> 63) ^ (g7 << 1));
                    }
                    c0412d2.N(i9);
                    while (i8 < c0521z2.f8722s) {
                        long g8 = c0521z2.g(i8);
                        c0412d2.J((g8 >> 63) ^ (g8 << 1));
                        i8++;
                    }
                    return;
                }
                while (i8 < c0521z2.f8722s) {
                    long g9 = c0521z2.g(i8);
                    c0412d2.K((g9 >> 63) ^ (g9 << 1), i7);
                    i8++;
                }
            } else if (z7) {
                c0412d2.M(i7, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    long longValue = ((Long) list.get(i12)).longValue();
                    i11 += C0412d2.z((longValue >> 63) ^ (longValue << 1));
                }
                c0412d2.N(i11);
                while (i8 < list.size()) {
                    long longValue2 = ((Long) list.get(i8)).longValue();
                    c0412d2.J((longValue2 >> 63) ^ (longValue2 << 1));
                    i8++;
                }
            } else {
                while (i8 < list.size()) {
                    long longValue3 = ((Long) list.get(i8)).longValue();
                    c0412d2.K((longValue3 >> 63) ^ (longValue3 << 1), i7);
                    i8++;
                }
            }
        }
    }

    public static void X(int i7, List list, C0516y2 c0516y2, boolean z7) {
        if (list != null && !list.isEmpty()) {
            c0516y2.getClass();
            boolean z8 = list instanceof C0462n2;
            int i8 = 0;
            C0412d2 c0412d2 = (C0412d2) c0516y2.f8717a;
            if (z8) {
                C0462n2 c0462n2 = (C0462n2) list;
                if (z7) {
                    c0412d2.M(i7, 2);
                    int i9 = 0;
                    for (int i10 = 0; i10 < c0462n2.f8618s; i10++) {
                        i9 += C0412d2.F(c0462n2.f(i10));
                    }
                    c0412d2.N(i9);
                    while (i8 < c0462n2.f8618s) {
                        c0412d2.N(c0462n2.f(i8));
                        i8++;
                    }
                    return;
                }
                while (i8 < c0462n2.f8618s) {
                    c0412d2.O(i7, c0462n2.f(i8));
                    i8++;
                }
            } else if (z7) {
                c0412d2.M(i7, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += C0412d2.F(((Integer) list.get(i12)).intValue());
                }
                c0412d2.N(i11);
                while (i8 < list.size()) {
                    c0412d2.N(((Integer) list.get(i8)).intValue());
                    i8++;
                }
            } else {
                while (i8 < list.size()) {
                    c0412d2.O(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
            }
        }
    }

    public static void Y(int i7, List list, C0516y2 c0516y2, boolean z7) {
        if (list != null && !list.isEmpty()) {
            c0516y2.getClass();
            boolean z8 = list instanceof C0521z2;
            int i8 = 0;
            C0412d2 c0412d2 = (C0412d2) c0516y2.f8717a;
            if (z8) {
                C0521z2 c0521z2 = (C0521z2) list;
                if (z7) {
                    c0412d2.M(i7, 2);
                    int i9 = 0;
                    for (int i10 = 0; i10 < c0521z2.f8722s; i10++) {
                        i9 += C0412d2.z(c0521z2.g(i10));
                    }
                    c0412d2.N(i9);
                    while (i8 < c0521z2.f8722s) {
                        c0412d2.J(c0521z2.g(i8));
                        i8++;
                    }
                    return;
                }
                while (i8 < c0521z2.f8722s) {
                    c0412d2.K(c0521z2.g(i8), i7);
                    i8++;
                }
            } else if (z7) {
                c0412d2.M(i7, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += C0412d2.z(((Long) list.get(i12)).longValue());
                }
                c0412d2.N(i11);
                while (i8 < list.size()) {
                    c0412d2.J(((Long) list.get(i8)).longValue());
                    i8++;
                }
            } else {
                while (i8 < list.size()) {
                    c0412d2.K(((Long) list.get(i8)).longValue(), i7);
                    i8++;
                }
            }
        }
    }

    public static int a(int i7, Object obj, L2 l22) {
        int F = C0412d2.F(i7 << 3);
        int a7 = ((V1) obj).a(l22);
        return C0412d2.F(a7) + a7 + F;
    }

    public static int b(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0412d2.l(i7) * size;
    }

    public static int c(int i7, List list, L2 l22) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += C0412d2.g(i7, (V1) list.get(i9), l22);
        }
        return i8;
    }

    public static int d(List list) {
        return list.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034 A[Catch: all -> 0x0044, TRY_LEAVE, TryCatch #1 {all -> 0x0044, blocks: (B:3:0x0004, B:5:0x0009, B:6:0x0017, B:8:0x001d, B:12:0x002e, B:14:0x0034, B:11:0x0026), top: B:24:0x0004, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static N3.g e(android.content.Context r5) {
        /*
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()
            android.os.StrictMode.allowThreadDiskWrites()     // Catch: java.lang.Throwable -> L44
            N3.a r1 = N3.a.f2491q
            java.io.File r2 = new java.io.File     // Catch: java.lang.RuntimeException -> L25 java.lang.Throwable -> L44
            java.lang.String r3 = "phenotype_hermetic"
            r4 = 0
            java.io.File r3 = r5.getDir(r3, r4)     // Catch: java.lang.RuntimeException -> L25 java.lang.Throwable -> L44
            java.lang.String r4 = "overrides.txt"
            r2.<init>(r3, r4)     // Catch: java.lang.RuntimeException -> L25 java.lang.Throwable -> L44
            boolean r3 = r2.exists()     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto L23
            N3.j r3 = new N3.j     // Catch: java.lang.Throwable -> L44
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L44
            goto L2e
        L23:
            r3 = r1
            goto L2e
        L25:
            r2 = move-exception
            java.lang.String r3 = "HermeticFileOverrides"
            java.lang.String r4 = "no data dir"
            android.util.Log.e(r3, r4, r2)     // Catch: java.lang.Throwable -> L44
            goto L23
        L2e:
            boolean r2 = r3.b()     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L46
            java.lang.Object r1 = r3.a()     // Catch: java.lang.Throwable -> L44
            java.io.File r1 = (java.io.File) r1     // Catch: java.lang.Throwable -> L44
            com.google.android.gms.internal.measurement.I1 r5 = h(r5, r1)     // Catch: java.lang.Throwable -> L44
            N3.j r1 = new N3.j     // Catch: java.lang.Throwable -> L44
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L44
            goto L46
        L44:
            r5 = move-exception
            goto L4a
        L46:
            android.os.StrictMode.setThreadPolicy(r0)
            return r1
        L4a:
            android.os.StrictMode.setThreadPolicy(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1.e(android.content.Context):N3.g");
    }

    public static InterfaceC0464o f(C0520z1 c0520z1) {
        if (c0520z1 == null) {
            return InterfaceC0464o.f8621e;
        }
        int i7 = AbstractC0397a2.f8504a[s.h.b(c0520z1.s())];
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            throw new IllegalStateException("Invalid entity: ".concat(String.valueOf(c0520z1)));
                        }
                        throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
                    }
                    List<C0520z1> v5 = c0520z1.v();
                    ArrayList arrayList = new ArrayList();
                    for (C0520z1 c0520z12 : v5) {
                        arrayList.add(f(c0520z12));
                    }
                    return new r(c0520z1.t(), arrayList);
                } else if (c0520z1.x()) {
                    return new C0424g(Boolean.valueOf(c0520z1.w()));
                } else {
                    return new C0424g(null);
                }
            } else if (c0520z1.y()) {
                return new C0429h(Double.valueOf(c0520z1.r()));
            } else {
                return new C0429h(null);
            }
        } else if (c0520z1.z()) {
            return new C0474q(c0520z1.u());
        } else {
            return InterfaceC0464o.f8627l;
        }
    }

    public static InterfaceC0464o g(Object obj) {
        if (obj == null) {
            return InterfaceC0464o.f;
        }
        if (obj instanceof String) {
            return new C0474q((String) obj);
        }
        if (obj instanceof Double) {
            return new C0429h((Double) obj);
        }
        if (obj instanceof Long) {
            return new C0429h(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C0429h(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C0424g((Boolean) obj);
        }
        if (obj instanceof Map) {
            C0459n c0459n = new C0459n();
            Map map = (Map) obj;
            for (Object obj2 : map.keySet()) {
                InterfaceC0464o g7 = g(map.get(obj2));
                if (obj2 != null) {
                    if (!(obj2 instanceof String)) {
                        obj2 = obj2.toString();
                    }
                    c0459n.n((String) obj2, g7);
                }
            }
            return c0459n;
        } else if (obj instanceof List) {
            C0419f c0419f = new C0419f();
            for (Object obj3 : (List) obj) {
                c0419f.t(g(obj3));
            }
            return c0419f;
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    public static I1 h(Context context, File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            o.j jVar = new o.j();
            HashMap hashMap = new HashMap();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    String[] split = readLine.split(" ", 3);
                    if (split.length != 3) {
                        Log.e("HermeticFileOverrides", "Invalid: " + readLine);
                    } else {
                        String str = new String(split[0]);
                        String decode = Uri.decode(new String(split[1]));
                        String str2 = (String) hashMap.get(split[2]);
                        if (str2 == null) {
                            String str3 = new String(split[2]);
                            str2 = Uri.decode(str3);
                            if (str2.length() < 1024 || str2 == str3) {
                                hashMap.put(str3, str2);
                            }
                        }
                        o.j jVar2 = (o.j) jVar.get(str);
                        if (jVar2 == null) {
                            jVar2 = new o.j();
                            jVar.put(str, jVar2);
                        }
                        jVar2.put(decode, str2);
                    }
                } else {
                    String valueOf = String.valueOf(file);
                    String packageName = context.getPackageName();
                    Log.w("HermeticFileOverrides", "Parsed " + valueOf + " for Android package " + packageName);
                    I1 i12 = new I1(jVar);
                    bufferedReader.close();
                    return i12;
                }
            }
        } catch (IOException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static void i(int i7, List list, C0516y2 c0516y2) {
        if (list != null && !list.isEmpty()) {
            c0516y2.getClass();
            for (int i8 = 0; i8 < list.size(); i8++) {
                C0412d2 c0412d2 = (C0412d2) c0516y2.f8717a;
                c0412d2.M(i7, 2);
                c0412d2.r((C0407c2) list.get(i8));
            }
        }
    }

    public static void j(int i7, List list, C0516y2 c0516y2, L2 l22) {
        if (list != null && !list.isEmpty()) {
            c0516y2.getClass();
            for (int i8 = 0; i8 < list.size(); i8++) {
                c0516y2.i(i7, list.get(i8), l22);
            }
        }
    }

    public static void k(int i7, List list, C0516y2 c0516y2, boolean z7) {
        if (list != null && !list.isEmpty()) {
            c0516y2.getClass();
            boolean z8 = list instanceof Y1;
            C0412d2 c0412d2 = (C0412d2) c0516y2.f8717a;
            if (z8) {
                AbstractC0515y1.v(list);
                if (z7) {
                    c0412d2.M(i7, 2);
                    throw null;
                }
                throw null;
            }
            if (z7) {
                c0412d2.M(i7, 2);
                int i8 = 0;
                for (int i9 = 0; i9 < list.size(); i9++) {
                    ((Boolean) list.get(i9)).getClass();
                    Logger logger = C0412d2.f;
                    i8++;
                }
                c0412d2.N(i8);
                for (int i10 = 0; i10 < list.size(); i10++) {
                    c0412d2.k(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
                }
                return;
            }
            for (int i11 = 0; i11 < list.size(); i11++) {
                boolean booleanValue = ((Boolean) list.get(i11)).booleanValue();
                c0412d2.M(i7, 0);
                c0412d2.k(booleanValue ? (byte) 1 : (byte) 0);
            }
        }
    }

    public static synchronized void l(D1 d1) {
        synchronized (C1.class) {
            if (f8236a == null) {
                f8236a = d1;
            } else {
                throw new IllegalStateException("init() already called");
            }
        }
    }

    public static void m(C0442j2 c0442j2, Object obj, Object obj2) {
        c0442j2.getClass();
        AbstractC0457m2 abstractC0457m2 = (AbstractC0457m2) obj;
        M2 m22 = abstractC0457m2.zzb;
        M2 m23 = ((AbstractC0457m2) obj2).zzb;
        M2 m24 = M2.f;
        if (!m24.equals(m23)) {
            if (m24.equals(m22)) {
                int i7 = m22.f8376a + m23.f8376a;
                int[] copyOf = Arrays.copyOf(m22.f8377b, i7);
                System.arraycopy(m23.f8377b, 0, copyOf, m22.f8376a, m23.f8376a);
                Object[] copyOf2 = Arrays.copyOf(m22.f8378c, i7);
                System.arraycopy(m23.f8378c, 0, copyOf2, m22.f8376a, m23.f8376a);
                m22 = new M2(i7, copyOf, copyOf2, true);
            } else {
                m22.getClass();
                if (!m23.equals(m24)) {
                    if (m22.f8379e) {
                        int i8 = m22.f8376a + m23.f8376a;
                        m22.b(i8);
                        System.arraycopy(m23.f8377b, 0, m22.f8377b, m22.f8376a, m23.f8376a);
                        System.arraycopy(m23.f8378c, 0, m22.f8378c, m22.f8376a, m23.f8376a);
                        m22.f8376a = i8;
                    } else {
                        throw new UnsupportedOperationException();
                    }
                }
            }
        }
        abstractC0457m2.zzb = m22;
    }

    public static void n(Object obj, int i7, InterfaceC0481r2 interfaceC0481r2, InterfaceC0477q2 interfaceC0477q2, C0442j2 c0442j2) {
        if (interfaceC0477q2 == null) {
            return;
        }
        boolean z7 = interfaceC0481r2 instanceof RandomAccess;
        M2 m22 = M2.f;
        M2 m23 = null;
        if (z7) {
            int size = interfaceC0481r2.size();
            int i8 = 0;
            for (int i9 = 0; i9 < size; i9++) {
                Integer num = (Integer) interfaceC0481r2.get(i9);
                int intValue = num.intValue();
                if (interfaceC0477q2.d(intValue)) {
                    if (i9 != i8) {
                        interfaceC0481r2.set(i8, num);
                    }
                    i8++;
                } else {
                    if (m23 == null) {
                        c0442j2.getClass();
                        AbstractC0457m2 abstractC0457m2 = (AbstractC0457m2) obj;
                        M2 m24 = abstractC0457m2.zzb;
                        if (m24 == m22) {
                            m24 = M2.e();
                            abstractC0457m2.zzb = m24;
                        }
                        m23 = m24;
                    }
                    c0442j2.getClass();
                    m23.c(i7 << 3, Long.valueOf(intValue));
                }
            }
            if (i8 != size) {
                interfaceC0481r2.subList(i8, size).clear();
                return;
            }
            return;
        }
        Iterator it = interfaceC0481r2.iterator();
        while (it.hasNext()) {
            int intValue2 = ((Integer) it.next()).intValue();
            if (!interfaceC0477q2.d(intValue2)) {
                if (m23 == null) {
                    c0442j2.getClass();
                    AbstractC0457m2 abstractC0457m22 = (AbstractC0457m2) obj;
                    M2 m25 = abstractC0457m22.zzb;
                    if (m25 == m22) {
                        m25 = M2.e();
                        abstractC0457m22.zzb = m25;
                    }
                    m23 = m25;
                }
                c0442j2.getClass();
                m23.c(i7 << 3, Long.valueOf(intValue2));
                it.remove();
            }
        }
    }

    public static boolean o(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static int p(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int B6 = C0412d2.B(i7) * size;
        for (int i8 = 0; i8 < list.size(); i8++) {
            int h7 = ((C0407c2) list.get(i8)).h();
            B6 += C0412d2.F(h7) + h7;
        }
        return B6;
    }

    public static int q(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0412d2.B(i7) * size) + s(list);
    }

    public static int r(int i7, List list, L2 l22) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int B6 = C0412d2.B(i7) * size;
        for (int i8 = 0; i8 < size; i8++) {
            int a7 = ((V1) list.get(i8)).a(l22);
            B6 += C0412d2.F(a7) + a7;
        }
        return B6;
    }

    public static int s(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0462n2) {
            C0462n2 c0462n2 = (C0462n2) list;
            i7 = 0;
            while (i8 < size) {
                i7 += C0412d2.z(c0462n2.f(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += C0412d2.z(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return i7;
    }

    public static void t(int i7, List list, C0516y2 c0516y2) {
        if (list != null && !list.isEmpty()) {
            c0516y2.getClass();
            boolean z7 = list instanceof InterfaceC0511x2;
            int i8 = 0;
            C0412d2 c0412d2 = (C0412d2) c0516y2.f8717a;
            if (z7) {
                InterfaceC0511x2 interfaceC0511x2 = (InterfaceC0511x2) list;
                while (i8 < list.size()) {
                    Object a7 = interfaceC0511x2.a();
                    if (a7 instanceof String) {
                        c0412d2.M(i7, 2);
                        c0412d2.s((String) a7);
                    } else {
                        c0412d2.M(i7, 2);
                        c0412d2.r((C0407c2) a7);
                    }
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                c0412d2.M(i7, 2);
                c0412d2.s((String) list.get(i8));
                i8++;
            }
        }
    }

    public static void u(int i7, List list, C0516y2 c0516y2, L2 l22) {
        if (list != null && !list.isEmpty()) {
            c0516y2.getClass();
            for (int i8 = 0; i8 < list.size(); i8++) {
                c0516y2.n(i7, list.get(i8), l22);
            }
        }
    }

    public static void v(int i7, List list, C0516y2 c0516y2, boolean z7) {
        if (list != null && !list.isEmpty()) {
            c0516y2.getClass();
            boolean z8 = list instanceof AbstractC0417e2;
            C0412d2 c0412d2 = (C0412d2) c0516y2.f8717a;
            if (z8) {
                AbstractC0515y1.v(list);
                if (z7) {
                    c0412d2.M(i7, 2);
                    throw null;
                }
                throw null;
            }
            int i8 = 0;
            if (z7) {
                c0412d2.M(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    ((Double) list.get(i10)).getClass();
                    Logger logger = C0412d2.f;
                    i9 += 8;
                }
                c0412d2.N(i9);
                while (i8 < list.size()) {
                    c0412d2.D(Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                double doubleValue = ((Double) list.get(i8)).doubleValue();
                c0412d2.getClass();
                c0412d2.E(Double.doubleToRawLongBits(doubleValue), i7);
                i8++;
            }
        }
    }

    public static int w(int i7, List list) {
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        int B6 = C0412d2.B(i7) * size;
        if (list instanceof InterfaceC0511x2) {
            InterfaceC0511x2 interfaceC0511x2 = (InterfaceC0511x2) list;
            while (i8 < size) {
                Object a7 = interfaceC0511x2.a();
                if (a7 instanceof C0407c2) {
                    int h7 = ((C0407c2) a7).h();
                    B6 = C0412d2.F(h7) + h7 + B6;
                } else {
                    B6 = C0412d2.i((String) a7) + B6;
                }
                i8++;
            }
        } else {
            while (i8 < size) {
                Object obj = list.get(i8);
                if (obj instanceof C0407c2) {
                    int h8 = ((C0407c2) obj).h();
                    B6 = C0412d2.F(h8) + h8 + B6;
                } else {
                    B6 = C0412d2.i((String) obj) + B6;
                }
                i8++;
            }
        }
        return B6;
    }

    public static int x(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0412d2.p(i7) * size;
    }

    public static int y(List list) {
        return list.size() << 2;
    }

    public static void z(int i7, List list, C0516y2 c0516y2, boolean z7) {
        if (list != null && !list.isEmpty()) {
            c0516y2.getClass();
            boolean z8 = list instanceof C0462n2;
            int i8 = 0;
            C0412d2 c0412d2 = (C0412d2) c0516y2.f8717a;
            if (z8) {
                C0462n2 c0462n2 = (C0462n2) list;
                if (z7) {
                    c0412d2.M(i7, 2);
                    int i9 = 0;
                    for (int i10 = 0; i10 < c0462n2.f8618s; i10++) {
                        i9 += C0412d2.z(c0462n2.f(i10));
                    }
                    c0412d2.N(i9);
                    while (i8 < c0462n2.f8618s) {
                        c0412d2.L(c0462n2.f(i8));
                        i8++;
                    }
                    return;
                }
                while (i8 < c0462n2.f8618s) {
                    c0412d2.I(i7, c0462n2.f(i8));
                    i8++;
                }
            } else if (z7) {
                c0412d2.M(i7, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += C0412d2.z(((Integer) list.get(i12)).intValue());
                }
                c0412d2.N(i11);
                while (i8 < list.size()) {
                    c0412d2.L(((Integer) list.get(i8)).intValue());
                    i8++;
                }
            } else {
                while (i8 < list.size()) {
                    c0412d2.I(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
            }
        }
    }
}
