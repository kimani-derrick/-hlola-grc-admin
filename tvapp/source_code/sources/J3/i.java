package J3;
/* loaded from: classes.dex */
public final class i extends m3.g {
    @Override // m3.g
    public final void r(u uVar, float f, float f7) {
        uVar.d(f7 * f, 180.0f, 90.0f);
        float f8 = f7 * 2.0f * f;
        q qVar = new q(0.0f, 0.0f, f8, f8);
        qVar.f = 180.0f;
        qVar.f1413g = 90.0f;
        uVar.f1422g.add(qVar);
        o oVar = new o(qVar);
        uVar.a(180.0f);
        uVar.f1423h.add(oVar);
        uVar.f1421e = 270.0f;
        float f9 = (0.0f + f8) * 0.5f;
        float f10 = (f8 - 0.0f) / 2.0f;
        double d = 270.0f;
        uVar.f1420c = (((float) Math.cos(Math.toRadians(d))) * f10) + f9;
        uVar.d = (f10 * ((float) Math.sin(Math.toRadians(d)))) + f9;
    }
}
