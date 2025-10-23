package F0;
/* loaded from: classes.dex */
public class c extends RuntimeException {
    public c() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(int r2) {
        /*
            r1 = this;
            r0 = 1
            if (r2 == r0) goto L12
            r0 = 2
            if (r2 == r0) goto Lf
            r0 = 3
            if (r2 == r0) goto Lc
            java.lang.String r2 = "Undefined timeout."
            goto L14
        Lc:
            java.lang.String r2 = "Detaching surface timed out."
            goto L14
        Lf:
            java.lang.String r2 = "Setting foreground mode timed out."
            goto L14
        L12:
            java.lang.String r2 = "Player release timed out."
        L14:
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.c.<init>(int):void");
    }
}
