package b6;

import a.AbstractC0189a;
import k3.AbstractC0958a;
import z5.C1526h;
/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f7213a = 0;

    static {
        Object m7;
        Object m8;
        Exception exc = new Exception();
        String simpleName = AbstractC0189a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            m7 = F5.a.class.getCanonicalName();
        } catch (Throwable th) {
            m7 = AbstractC0958a.m(th);
        }
        if (C1526h.a(m7) != null) {
            m7 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        String str = (String) m7;
        try {
            m8 = u.class.getCanonicalName();
        } catch (Throwable th2) {
            m8 = AbstractC0958a.m(th2);
        }
        if (C1526h.a(m8) != null) {
            m8 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        String str2 = (String) m8;
    }
}
