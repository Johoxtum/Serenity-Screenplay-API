package models.headers;


public enum Header {

    CONTENT_TYPE("content-type","application/json"),
    CHANNEL("Channel","PB"),
    AUTHORIZATION("authorization","eyJjdHkiOiJKV1QiLCJlbmMiOiJBMjU2R0NNIiwiYWxnIjoiUlNBLU9BRVAtMjU2In0.dabeSoX1CQUCcchFkAA6u7xVqKi4w8PyLjrYGqw10FodhePceoW-cL5bbwUMPVnMLNiVgz6ppibiV33fLNQD_f6_F-PC_w8Hq3BTecOTwaeqTBQdzorsNReXzFgd4X15Gx_ln4P7h78TVs8ZLPEozWp61EqP0-xCVqSaRn1nAqRIV0bQpCOYl1nqf-SAydjmLaWkx4iniC6wSwf8reaRUOi9W6sM5asTWyXVeS1ZWeWVB2lN4UYVWVxx0Nl1KejNXHzpCCKjQvOOW8dHxnAIMTc7U1rcl7xve8UiDRZpdr7U4C6h1nuhiJ9i0UWrASNs2wjog-0B3_bhV45h1TcmpQ.-Q-cE-IMJaWb7ahi.5wzU0SKSyM9aFEUL2XO5fuzvIbvrNw1QqEjnpqBDCsD3mC8qBzOxSNVDQ5HkGJrW5e7HD-QMpbQ2u_QkkfGDSN9KXzPQM7R4c_AZdV1PH75ZK-Oz5jGp8r2SmvQ2ckdAIw41cCGVndGRUOKVGc-JwrwLlQZlJUxIST15XdpLIvfcElVGk3fJRvJC1sk0aOw3LDBaeMOP__FKl7kLhTg9O9iuyrIASyFylYTcK-gyd9bSDqe17WtxW-VpwvzCN4QXPyxmXKNjaBZjWzX_J8MN4ZooDQVcvMgaHyT383dcLdqitPdNf_6skPOrm5AaNlWiakjtR8RBueYcRzezcKMuvgKrxVehfiLAizVU9I-Zacx9TLHy-RvLwdPBG9kxOlyiREZqdcPPQhqSQA1q63fhrn6qYDhaMWFoM3jZCRN_GK7wnlur3Cw3ujqWryVumDa-GuZO7AE3HRN9hf3Gkk7ng9XDNJqZIQZdC3Z8MMk-vF6oYS41i6VaynM-aL_RZv1ZBGtAzrj5eptlqeKozp8NuPRRPsjgT82Qh09qH7m7oZbaqGBTy2l9TAVp0_JKbe9q79ge4777BrBi2r-y7-rz_Xj8vfkcrB_gN0Gq7K1WhqPZMziRjxdSsQQEDSAMmyoZWVZvWxEzwpEF6umrKub3zSa2c2ilI3fWBi4HvM1kOCRX1RbHH3by_vV3fa2EzY-yNo4D3cvw1eq66YrmyYWWg6tQWf1QE-84g7Pmh0LcoPy3SdPn_gsZqoaXGRgXQSiC4q0yv4g8yWK63LYX_XhFdvyUsZJwE8ri5mCu2em27WxnWmGX9l824VOiWlYcwUvm_ZsPqlu9fRgCixH-SWXt5OPY0MDOL5tk6efdNMc5kXOZEBkfE43cN9o5YBDm-FmmaJEszjH8ck20yQqNIvZKGLx_EgA0gzHasrFf0SonGcqQ4KvCsy3VFbd29BsPZFfn2M_-VV5mehr22H9B3Hz2NxN3grt-Y1uMCiamVn34IiJWDCjW7brKOqZVzXy_Sa-3QY7e1D9e7b8wEx1fAOCk2T8It1ZeQOZLevkzXlo_b6fH3YboJWkUKqzr_fsQhatSUpZYmI65uESzU38RsPRdXACftw0FwzUBaGQxqPaSi9mEHEVFzsx0dB5uaM9icci82ExM0r0iu1OgnCgu5MYK9gYkuhdeL75ibxtO6tKuloDT7GuBs6bMW2UXJxBRENuI-pFEYlNsBI3PGTWc3EEuQpesxIj4Oa31icFz1-h0EQc7lsm5Z3yWr5C95J5OZ0xreCV4kLphoeL3s5E.5N8R3iwkpywTiquY1Q1yzg"),
    ORIGIN("origin","https://virtual.labdigbdbqapb.com"),
    AUTHORYTY ("authority","pb-dev-api-bogota.avaldigitallabs.com"),
    REMOTEADDRES("remoteAddress","127.0.0.1" ),
    TERMINALID("terminalId","IN01"),
    ACEPT("accept","application/json"),
    XVERSION("x-version","2");



    public String getHeader() {
        return header;
    }

    public String getValue() {
        return value;
    }

    private final String header;
    private final String value;
    private Header(String header, String value) {
        this.header = header;
        this.value = value;
    }
}