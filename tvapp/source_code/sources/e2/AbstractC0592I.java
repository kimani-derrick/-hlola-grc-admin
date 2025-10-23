package e2;

import java.util.HashSet;
/* renamed from: e2.I  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0592I {

    /* renamed from: a  reason: collision with root package name */
    public static final HashSet f9559a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public static String f9560b = "goog.exo.core";

    public static synchronized void a(String str) {
        synchronized (AbstractC0592I.class) {
            if (f9559a.add(str)) {
                f9560b += ", " + str;
            }
        }
    }
}
