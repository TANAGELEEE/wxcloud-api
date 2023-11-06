/**
 * Copyright ©2021-2025 tanagelee Corporation, All Rights Reserved
 */
package com.tencent.wxcloudrun.model;

import lombok.Data;

import java.io.Serializable;

/**
 * Score
 *
 * @author liyunjun
 * @date 2023/11/6 21:15
 */
@Data
public class Score implements Serializable {
    private Long id;
    private String stuNo;
    private Long score;
    private String name;
}