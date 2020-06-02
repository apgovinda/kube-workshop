package org.dell.education.api.assignment;

import java.io.Serializable;

public class Response implements Serializable {
    private Integer code;
    private String response;

    public Response(Integer code, String response) {
        this.code = code;
        this.response = response;
    }

    @Override
    public String toString() {
        return "Response{" +
                "code=" + code +
                ", response='" + response + '\'' +
                '}';
    }
}
